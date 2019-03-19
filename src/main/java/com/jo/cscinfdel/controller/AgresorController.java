package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.Agresor;
import com.jo.cscinfdel.model.QAgresor;
import com.jo.cscinfdel.repository.AgresorRepository;
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
@RequestMapping("/Agresor")
public class AgresorController {

    @Autowired
    private AgresorRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Agresor> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Agresor object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Agresor create(@RequestBody Agresor object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Agresor update(@RequestBody Agresor object) {

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
        List<Agresor> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QAgresor qAgresor = QAgresor.agresor;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qAgresor.identificacion.containsIgnoreCase(filter)
                .or(qAgresor.nombres.containsIgnoreCase(filter))
                .or(qAgresor.apellidos.containsIgnoreCase(filter))
                .or(qAgresor.direccion.containsIgnoreCase(filter))
                .or(qAgresor.telefono.containsIgnoreCase(filter))
                .or(qAgresor.sexo.descripcion.containsIgnoreCase(filter))
                .or(qAgresor.nacionalidad.descripcion.containsIgnoreCase(filter))
                .or(qAgresor.etnia.descripcion.containsIgnoreCase(filter))
                .or(qAgresor.estadoCivil.descripcion.containsIgnoreCase(filter))
                .or(qAgresor.tipoDiscapacidad.descripcion.containsIgnoreCase(filter));

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<Agresor> items = repository.findAll(predicate, pageRequest)
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
    public List<Agresor> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QAgresor qAgresor = QAgresor.agresor;

        Predicate predicate = qAgresor.nombreCompleto.containsIgnoreCase(key);

        Iterable<Agresor> iterable = repository.findAll(predicate);

        List<Agresor> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }

}
