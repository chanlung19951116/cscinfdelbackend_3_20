package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.QTipoAmenaza;
import com.jo.cscinfdel.model.TipoAmenaza;
import com.jo.cscinfdel.repository.TipoAmenazaRepository;
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
@RequestMapping("/TipoAmenaza")
public class TipoAmenazaController {

    @Autowired
    private TipoAmenazaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<TipoAmenaza> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody TipoAmenaza object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public TipoAmenaza create(@RequestBody TipoAmenaza object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public TipoAmenaza update(@RequestBody TipoAmenaza object) {

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
        List<TipoAmenaza> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QTipoAmenaza qTipoAmenaza = QTipoAmenaza.tipoAmenaza;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qTipoAmenaza.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<TipoAmenaza> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }
}

