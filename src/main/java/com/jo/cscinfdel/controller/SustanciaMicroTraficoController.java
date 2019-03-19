package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.QSustanciaMicroTrafico;
import com.jo.cscinfdel.model.SustanciaMicroTrafico;
import com.jo.cscinfdel.repository.SustanciaMicroTraficoRepository;
import com.querydsl.core.types.Predicate;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/SustanciaMicroTrafico")
public class SustanciaMicroTraficoController {

    @Autowired
    private SustanciaMicroTraficoRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<SustanciaMicroTrafico> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody SustanciaMicroTrafico object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public SustanciaMicroTrafico create(@RequestBody SustanciaMicroTrafico object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public SustanciaMicroTrafico update(@RequestBody SustanciaMicroTrafico object) {

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
        List<SustanciaMicroTrafico> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QSustanciaMicroTrafico qSustanciaMicroTrafico = QSustanciaMicroTrafico.sustanciaMicroTrafico;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qSustanciaMicroTrafico.smtDescripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<SustanciaMicroTrafico> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }



    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor()
    static class RequestBody4AutoComplete {
        @NonNull
        String key;
    }

    @RequestMapping(value = "/auto-complete", method = RequestMethod.POST)
    public List<SustanciaMicroTrafico> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QSustanciaMicroTrafico qSustanciaMicroTrafico = QSustanciaMicroTrafico.sustanciaMicroTrafico;

        Predicate predicate = qSustanciaMicroTrafico.smtDescripcion.containsIgnoreCase(key);

        Iterable<SustanciaMicroTrafico> iterable = repository.findAll(predicate);

        List<SustanciaMicroTrafico> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }

}


