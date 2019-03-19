package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.DrogaSustancia;
import com.jo.cscinfdel.repository.DrogaSustanciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrogaSustancia")
public class DrogaSustanciaController {

    @Autowired
    private DrogaSustanciaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<DrogaSustancia> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody DrogaSustancia object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public DrogaSustancia create(@RequestBody DrogaSustancia object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DrogaSustancia update(@RequestBody DrogaSustancia object) {

        return repository.save(object);
    }
}

