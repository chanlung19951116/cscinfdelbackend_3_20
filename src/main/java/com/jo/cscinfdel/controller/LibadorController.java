package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.LibadorRepository;
import com.jo.cscinfdel.repository.LibadoresRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.util.CollectionUtils;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Libador")
public class LibadorController {

    @Autowired
    private LibadorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Libador> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Libador object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Libador create(@RequestBody Libador object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Libador update(@RequestBody Libador object) {

        return repository.save(object);
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
    public List<Libador> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QLibador qLibador = QLibador.libador;

        Predicate predicate = qLibador.lbNombreCompleto.containsIgnoreCase(key);

        Iterable<Libador> libadorIterable = repository.findAll(predicate);

        List<Libador> libadorList = new ArrayList<>();
        libadorIterable.forEach(libadorList::add);

        return libadorList;
    }
}
