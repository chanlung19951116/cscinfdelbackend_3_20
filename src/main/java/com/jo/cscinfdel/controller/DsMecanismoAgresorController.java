package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.DsMecanismoAgresor;
import com.jo.cscinfdel.repository.DsMecanismoAgresorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DsMecanismoAgresor")
public class DsMecanismoAgresorController {

    @Autowired
    private DsMecanismoAgresorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<DsMecanismoAgresor> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody DsMecanismoAgresor object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public DsMecanismoAgresor create(@RequestBody DsMecanismoAgresor object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DsMecanismoAgresor update(@RequestBody DsMecanismoAgresor object) {

        return repository.save(object);
    }
}

