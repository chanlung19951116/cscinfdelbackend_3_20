package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.*;
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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/RobosHurtosGeneral")
public class RobosHurtosGeneralController {

    @Autowired
    private RobosHurtosGeneralRepository repository;

    @Autowired
    private ObjetosHurtadosRepository objetosHurtadosRepository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<RobosHurtosGeneral> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody RobosHurtosGeneral object) {


        QObjetosHurtados qObjetosHurtados = QObjetosHurtados.objetosHurtados;

        Predicate predicate = qObjetosHurtados.id.ohCodigoUnico.eq(object.getRhCodigoUnico());

        this.objetosHurtadosRepository.deleteAll(this.objetosHurtadosRepository.findAll(predicate));

        object.setObjetosHurtadosList(null);

        repository.delete(object);

    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public RobosHurtosGeneral create(@RequestBody RobosHurtosGeneral object) {

        return this.saveObject(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RobosHurtosGeneral update(@RequestBody RobosHurtosGeneral object) {

        return this.saveObject(object);
    }

    private RobosHurtosGeneral saveObject(RobosHurtosGeneral object) {


        Set<ObjetosHurtados> objetosHurtadosList = object.getObjetosHurtadosList();

        if (objetosHurtadosList == null) {
            objetosHurtadosList = new HashSet<>();
        }
        object.setObjetosHurtadosList(null);

        object = repository.save(object);


        RobosHurtosGeneral finalObject = object;


        objetosHurtadosList.forEach(item -> {
            item.setRobosHurtosGeneral(finalObject);
        });
        QObjetosHurtados qObjetosHurtados = QObjetosHurtados.objetosHurtados;

        Predicate predicate = qObjetosHurtados.id.ohCodigoUnico.eq(object.getRhCodigoUnico());

        this.objetosHurtadosRepository.deleteAll(this.objetosHurtadosRepository.findAll(predicate));
        this.objetosHurtadosRepository.saveAll(objetosHurtadosList);

        return object;
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
        List<RobosHurtosGeneral> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QRobosHurtosGeneral qRobosHurtosGeneral = QRobosHurtosGeneral.robosHurtosGeneral;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qRobosHurtosGeneral.rhCodigoSecuencial.containsIgnoreCase(filter);


        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<RobosHurtosGeneral> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(lesiones -> {
            lesiones.getObjetosHurtadosList().forEach(objetosHurtados -> {
                objetosHurtados.setRobosHurtosGeneral(null);
            });
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }

}
