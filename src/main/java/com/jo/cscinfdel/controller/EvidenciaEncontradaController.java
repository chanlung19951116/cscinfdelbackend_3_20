package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.EvidenciaEncontrada;
import com.jo.cscinfdel.model.QEvidenciaEncontrada;
import com.jo.cscinfdel.repository.EvidenciaEncontradaRepository;
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
@RequestMapping("/EvidenciaEncontrada")
public class EvidenciaEncontradaController {

    @Autowired
    private EvidenciaEncontradaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<EvidenciaEncontrada> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody EvidenciaEncontrada object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public EvidenciaEncontrada create(@RequestBody EvidenciaEncontrada object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public EvidenciaEncontrada update(@RequestBody EvidenciaEncontrada object) {

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
        List<EvidenciaEncontrada> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QEvidenciaEncontrada qEvidenciaEncontrada = QEvidenciaEncontrada.evidenciaEncontrada;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qEvidenciaEncontrada.eeDescripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<EvidenciaEncontrada> items = repository.findAll(predicate, pageRequest)
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
    public List<EvidenciaEncontrada> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QEvidenciaEncontrada qEvidenciaEncontrada = QEvidenciaEncontrada.evidenciaEncontrada;

        Predicate predicate = qEvidenciaEncontrada.eeDescripcion.containsIgnoreCase(key);

        Iterable<EvidenciaEncontrada> iterable = repository.findAll(predicate);

        List<EvidenciaEncontrada> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }

}

