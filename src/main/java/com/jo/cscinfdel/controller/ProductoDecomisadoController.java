package com.jo.cscinfdel.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jo.cscinfdel.model.ProductoDecomisado;
import com.jo.cscinfdel.model.QProductoDecomisado;
import com.jo.cscinfdel.repository.ProductoDecomisadoRepository;
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
@RequestMapping("/ProductoDecomisado")
public class ProductoDecomisadoController {

    @Autowired
    private ProductoDecomisadoRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<ProductoDecomisado> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody ProductoDecomisado object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ProductoDecomisado create(@RequestBody ProductoDecomisado object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ProductoDecomisado update(@RequestBody ProductoDecomisado object) {


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
        List<ProductoDecomisado> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QProductoDecomisado qProductoDecomisado = QProductoDecomisado.productoDecomisado;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qProductoDecomisado.descripcion.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<ProductoDecomisado> items = repository.findAll(predicate, pageRequest)
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
    public List<ProductoDecomisado> autoComplete(@RequestBody RequestBody4AutoComplete requestBody) {

        String key = requestBody.key;

        QProductoDecomisado qProductoDecomisado = QProductoDecomisado.productoDecomisado;

        Predicate predicate = qProductoDecomisado.descripcion.containsIgnoreCase(key);

        Iterable<ProductoDecomisado> iterable = repository.findAll(predicate);

        List<ProductoDecomisado> list = new ArrayList<>();
        iterable.forEach(list::add);

        return list;
    }
}

