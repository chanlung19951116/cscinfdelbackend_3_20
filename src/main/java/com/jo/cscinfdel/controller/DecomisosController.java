package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.Decomisos;
import com.jo.cscinfdel.model.ProductosDecomisados;
import com.jo.cscinfdel.model.QDecomisos;
import com.jo.cscinfdel.model.QProductosDecomisados;
import com.jo.cscinfdel.repository.DecomisosRepository;
import com.jo.cscinfdel.repository.ProductosDecomisadosRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPADeleteClause;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/Decomisos")
public class DecomisosController {

    @Autowired
    private DecomisosRepository repository;

    @Autowired
    private ProductosDecomisadosRepository productosDecomisadosRepository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Decomisos> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Decomisos object) {

        QProductosDecomisados qProductosDecomisados = QProductosDecomisados.productosDecomisados;

        Predicate predicate = qProductosDecomisados.id.pdCodigoUnico.eq(object.getDcCodigoUnico());

        this.productosDecomisadosRepository.deleteAll(this.productosDecomisadosRepository.findAll(predicate));

        object.setProductosDecomisadosList(null);

        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Decomisos create(@RequestBody Decomisos object) {

        return saveObject(object);
    }

    private Decomisos saveObject(Decomisos object) {
        Set<ProductosDecomisados> productosDecomisadosList = object.getProductosDecomisadosList();
        if (productosDecomisadosList == null) {
            productosDecomisadosList = new HashSet<>();
        }
        object.setProductosDecomisadosList(null);

        object = repository.save(object);

        Decomisos finalObject = object;
        productosDecomisadosList.forEach(item -> {
            item.setDecomisos(finalObject);
        });
        QProductosDecomisados qProductosDecomisados = QProductosDecomisados.productosDecomisados;

        Predicate predicate = qProductosDecomisados.id.pdCodigoUnico.eq(object.getDcCodigoUnico());

        this.productosDecomisadosRepository.deleteAll(this.productosDecomisadosRepository.findAll(predicate));

        this.productosDecomisadosRepository.saveAll(productosDecomisadosList);

        return object;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Decomisos update(@RequestBody Decomisos object) {

        return saveObject(object);
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
        List<Decomisos> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QDecomisos qDecomisos = QDecomisos.decomisos;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qDecomisos.dcActaRetiro.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<Decomisos> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(decomisos -> {
            decomisos.getProductosDecomisadosList().forEach(productosDecomisados -> {
                productosDecomisados.setDecomisos(null);
            });
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }


}
