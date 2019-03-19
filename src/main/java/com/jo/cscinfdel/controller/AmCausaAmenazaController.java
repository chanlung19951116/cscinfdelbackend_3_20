package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.AmCausaAmenaza;
import com.jo.cscinfdel.model.QAmCausaAmenaza;
import com.jo.cscinfdel.repository.AmCausaAmenazaRepository;
import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AmCausaAmenaza")
public class AmCausaAmenazaController {
    @Autowired
    private AmCausaAmenazaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<AmCausaAmenaza> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody AmCausaAmenaza object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public AmCausaAmenaza create(@RequestBody AmCausaAmenaza object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public AmCausaAmenaza update(@RequestBody AmCausaAmenaza object) {

        return repository.save(object);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor()
    public static class RequestBody4GetByPageAndFilter {
        Integer pageNumber = 0;
        Integer pageSize = 1;
        String filter = "";
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor()
    public static class ResponseBody4GetByPageAndFilter {
        Long totalCount;
        List<AmCausaAmenaza> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QAmCausaAmenaza qAmCausaAmenaza = QAmCausaAmenaza.amCausaAmenaza;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qAmCausaAmenaza.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<AmCausaAmenaza> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }
}

