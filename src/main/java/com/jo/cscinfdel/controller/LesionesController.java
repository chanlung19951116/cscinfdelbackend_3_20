package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.LesionAgresorRepository;
import com.jo.cscinfdel.repository.LesionVictimaRepository;
import com.jo.cscinfdel.repository.LesionesRepository;
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
@RequestMapping("/Lesiones")
public class LesionesController {

    @Autowired
    private LesionesRepository repository;

    @Autowired
    private LesionAgresorRepository lesionAgresorRepository;

    @Autowired
    private LesionVictimaRepository lesionVictimaRepository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Lesiones> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Lesiones object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Lesiones create(@RequestBody Lesiones object) {

        return this.saveObject(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Lesiones update(@RequestBody Lesiones object) {

        return this.saveObject(object);
    }

    private Lesiones saveObject(Lesiones object) {


        Set<LesionAgresor> lesionAgresorList = object.getLesionAgresorList();
        if (lesionAgresorList == null) {
            lesionAgresorList = new HashSet<>();
        }
        object.setLesionAgresorList(null);


        Set<LesionVictima> lesionVictimaList = object.getLesionVictimaList();
        if (lesionVictimaList == null) {
            lesionVictimaList = new HashSet<>();
        }
        object.setLesionVictimaList(null);


        object = repository.save(object);


        Lesiones finalObject = object;

        // lesionAgresor
        lesionAgresorList.forEach(item -> {
            item.setLesiones(finalObject);
        });
        QLesionAgresor qLesionAgresor = QLesionAgresor.lesionAgresor;

        Predicate predicate4LesionAgresor = qLesionAgresor.id.codigo.eq(object.getLeCodigoUnico());

        this.lesionAgresorRepository.deleteAll(this.lesionAgresorRepository.findAll(predicate4LesionAgresor));
        this.lesionAgresorRepository.saveAll(lesionAgresorList);

        // lesionVictima
        lesionVictimaList.forEach(item -> {
            item.setLesiones(finalObject);
        });
        QLesionVictima qLesionVictima = QLesionVictima.lesionVictima;

        Predicate predicate4LesionVictima = qLesionVictima.id.codigo.eq(object.getLeCodigoUnico());

        this.lesionVictimaRepository.deleteAll(this.lesionVictimaRepository.findAll(predicate4LesionVictima));
        this.lesionVictimaRepository.saveAll(lesionVictimaList);

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
        List<Lesiones> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QLesiones qLesiones = QLesiones.lesiones;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qLesiones.leCodigoSecuencial.containsIgnoreCase(filter)
                .or(qLesiones.leClaveExpediente.containsIgnoreCase(filter))
                .or(qLesiones.leNumeroDenuncia.containsIgnoreCase(filter))
                .or(qLesiones.leDireccionDenuncia.containsIgnoreCase(filter))
                .or(qLesiones.leObservaciones.containsIgnoreCase(filter));


        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<Lesiones> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(lesiones -> {
            lesiones.getLesionAgresorList().forEach(lesionAgresor -> {
                lesionAgresor.setLesiones(null);
            });
            lesiones.getLesionVictimaList().forEach(lesionVictima -> {
                lesionVictima.setLesiones(null);
            });
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }


}
