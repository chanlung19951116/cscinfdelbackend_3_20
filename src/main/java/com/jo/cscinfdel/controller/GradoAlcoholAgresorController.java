package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.GradoAlcoholAgresor;
import com.jo.cscinfdel.model.QGradoAlcoholAgresor;
import com.jo.cscinfdel.repository.GradoAlcoholAgresorRepository;
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
@RequestMapping("/GradoAlcoholAgresor")
public class GradoAlcoholAgresorController {

    @Autowired
    private GradoAlcoholAgresorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<GradoAlcoholAgresor> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody GradoAlcoholAgresor object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public GradoAlcoholAgresor create(@RequestBody GradoAlcoholAgresor object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public GradoAlcoholAgresor update(@RequestBody GradoAlcoholAgresor object) {

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
        List<GradoAlcoholAgresor> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QGradoAlcoholAgresor qGradoAlcoholAgresor = QGradoAlcoholAgresor.gradoAlcoholAgresor;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qGradoAlcoholAgresor.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<GradoAlcoholAgresor> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }
}

