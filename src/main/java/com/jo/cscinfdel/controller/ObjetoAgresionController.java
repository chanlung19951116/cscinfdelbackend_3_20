package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.ObjetoAgresion;
import com.jo.cscinfdel.model.QObjetoAgresion;
import com.jo.cscinfdel.repository.ObjetoAgresionRepository;
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
@RequestMapping("/ObjetoAgresion")
public class ObjetoAgresionController {

    @Autowired
    private ObjetoAgresionRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<ObjetoAgresion> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody ObjetoAgresion object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ObjetoAgresion create(@RequestBody ObjetoAgresion object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ObjetoAgresion update(@RequestBody ObjetoAgresion object) {

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
        List<ObjetoAgresion> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QObjetoAgresion qObjetoAgresion = QObjetoAgresion.objetoAgresion;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qObjetoAgresion.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<ObjetoAgresion> items = repository.findAll(predicate, pageRequest)
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
    public List<ObjetoAgresion> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QObjetoAgresion qObjetoAgresion = QObjetoAgresion.objetoAgresion;

        Predicate predicate = qObjetoAgresion.descripcion.containsIgnoreCase(key);

        Iterable<ObjetoAgresion> iterable = repository.findAll(predicate);

        List<ObjetoAgresion> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }
}

