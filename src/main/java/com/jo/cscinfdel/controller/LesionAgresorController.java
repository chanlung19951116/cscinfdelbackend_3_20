package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.LesionAgresor;
import com.jo.cscinfdel.model.QLesionAgresor;
import com.jo.cscinfdel.repository.LesionAgresorRepository;
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
@RequestMapping("/LesionAgresor")
public class LesionAgresorController {

    @Autowired
    private LesionAgresorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<LesionAgresor> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody LesionAgresor object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public LesionAgresor create(@RequestBody LesionAgresor object) {

        LesionAgresor result = repository.save(object);
        result.setLesiones(null);

        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public LesionAgresor update(@RequestBody LesionAgresor object) {

        LesionAgresor result = repository.save(object);
        result.setLesiones(null);

        return result;
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
        List<LesionAgresor> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QLesionAgresor qLesionAgresor = QLesionAgresor.lesionAgresor;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qLesionAgresor.agresor.nombreCompleto.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<LesionAgresor> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(lesionAgresor -> {
            lesionAgresor.setLesiones(null);
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }


}

