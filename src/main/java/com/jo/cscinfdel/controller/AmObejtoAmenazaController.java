package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.AlcoholAgresor;
import com.jo.cscinfdel.model.AmObejtoAmenaza;
import com.jo.cscinfdel.repository.AlcoholAgresorRepository;
import com.jo.cscinfdel.repository.AmObejtoAmenazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/AmObejtoAmenaza")
public class AmObejtoAmenazaController {

    @Autowired
    private AmObejtoAmenazaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<AmObejtoAmenaza> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody AmObejtoAmenaza object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public AmObejtoAmenaza create(@RequestBody AmObejtoAmenaza object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public AmObejtoAmenaza update(@RequestBody AmObejtoAmenaza object) {

        return repository.save(object);
    }
}

