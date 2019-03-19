package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.Victima;
import com.jo.cscinfdel.model.QVictima;
import com.jo.cscinfdel.repository.VictimaRepository;
import com.jo.cscinfdel.repository.VictimaRepository;
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
@RequestMapping("/Victima")
public class VictimaController {

    @Autowired
    private VictimaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Victima> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Victima object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Victima create(@RequestBody Victima object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Victima update(@RequestBody Victima object) {

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
        List<Victima> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QVictima qVictima = QVictima.victima;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qVictima.victimaIdentificacion.containsIgnoreCase(filter)
                .or(qVictima.victimaNombres.containsIgnoreCase(filter))
                .or(qVictima.victimaApellidos.containsIgnoreCase(filter))
                .or(qVictima.victimaDireccion.containsIgnoreCase(filter))
                .or(qVictima.victimaTelefono.containsIgnoreCase(filter))
                .or(qVictima.sexo.descripcion.containsIgnoreCase(filter))
                .or(qVictima.nacionalidad.descripcion.containsIgnoreCase(filter))
                .or(qVictima.etnia.descripcion.containsIgnoreCase(filter))
                .or(qVictima.estadoCivil.descripcion.containsIgnoreCase(filter))
                .or(qVictima.tipoDiscapacidad.descripcion.containsIgnoreCase(filter))
                .or(qVictima.ocupacion.descripcion.containsIgnoreCase(filter))
                .or(qVictima.victimaEdad.stringValue().containsIgnoreCase(filter))
                .or(qVictima.victimaAdolecente.stringValue().containsIgnoreCase(filter))
                .or(qVictima.tipoEmpresa.tipoEmpresaDescripcion.containsIgnoreCase(filter));

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<Victima> items = repository.findAll(predicate, pageRequest)
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
    public List<Victima> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QVictima qVictima = QVictima.victima;

        Predicate predicate = qVictima.victimaNombreCompleto.containsIgnoreCase(key);

        Iterable<Victima> iterable = repository.findAll(predicate);

        List<Victima> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }

}
