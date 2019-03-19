package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.TipoUsuario;
import com.jo.cscinfdel.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TipoUsuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<TipoUsuario> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody TipoUsuario object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public TipoUsuario create(@RequestBody TipoUsuario object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public TipoUsuario update(@RequestBody TipoUsuario object) {

        return repository.save(object);
    }
}
