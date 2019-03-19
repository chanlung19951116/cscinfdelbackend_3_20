package com.jo.cscinfdel.controller;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.*;
import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FrecuenciaAgresor")
public class FrecuenciaAgresorController {

    @Autowired
    private FrecuenciaAgresorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<FrecuenciaAgresor> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody FrecuenciaAgresor object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public FrecuenciaAgresor create(@RequestBody FrecuenciaAgresor object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public FrecuenciaAgresor update(@RequestBody FrecuenciaAgresor object) {

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
        List<FrecuenciaAgresor> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QFrecuenciaAgresor qFrecuenciaAgresor = QFrecuenciaAgresor.frecuenciaAgresor;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qFrecuenciaAgresor.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<FrecuenciaAgresor> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }



}

