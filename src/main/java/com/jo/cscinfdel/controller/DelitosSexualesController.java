package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.DelitosSexuales;
import com.jo.cscinfdel.model.QDelitosSexuales;
import com.jo.cscinfdel.repository.DelitosSexualesRepository;
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

import java.util.List;

@RestController
@RequestMapping("/DelitosSexuales")
public class DelitosSexualesController {

    @Autowired
    private DelitosSexualesRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<DelitosSexuales> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody DelitosSexuales object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public DelitosSexuales create(@RequestBody DelitosSexuales object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DelitosSexuales update(@RequestBody DelitosSexuales object) {

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
        List<DelitosSexuales> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QDelitosSexuales qDelitosSexuales = QDelitosSexuales.delitosSexuales;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qDelitosSexuales.dsCodigoSecuencial.containsIgnoreCase(filter)
                .or(qDelitosSexuales.dsClaveExpediente.containsIgnoreCase(filter))
                .or(qDelitosSexuales.dsNumeroDenuncia.containsIgnoreCase(filter))
                .or(qDelitosSexuales.dsVicDiscapacidadesDiferentes.containsIgnoreCase(filter))
                .or(qDelitosSexuales.dsObservaciones.containsIgnoreCase(filter));

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<DelitosSexuales> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }

}
