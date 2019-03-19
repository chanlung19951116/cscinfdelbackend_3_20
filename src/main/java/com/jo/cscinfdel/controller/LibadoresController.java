package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.Libadores;
import com.jo.cscinfdel.model.QLibadores;
import com.jo.cscinfdel.repository.LibadoresRepository;
import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Libadores")
public class LibadoresController {

    @Autowired
    private LibadoresRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<Libadores> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Libadores object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Libadores create(@RequestBody Libadores object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Libadores update(@RequestBody Libadores object) {

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
        List<Libadores> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QLibadores qLibadores = QLibadores.libadores;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qLibadores.libador.lbApellidos.containsIgnoreCase(filter)
                        .or(qLibadores.libador.lbNombres.containsIgnoreCase(filter))
                        .or(qLibadores.tipoProcedimiento.descripcion.containsIgnoreCase(filter))
                        .or(qLibadores.parroquia.descripcion.containsIgnoreCase(filter))
                        .or(qLibadores.tipoResolucion.descripcion.containsIgnoreCase(filter))
                        .or(qLibadores.lbExpediente.containsIgnoreCase(filter))
                        .or(qLibadores.lbDireccionInfraccion.containsIgnoreCase(filter))
//                        .or(qLibadores.lbFechaInfraccion.stringValue().containsIgnoreCase(filter))
                        .or(qLibadores.lbNumeroCitacion.containsIgnoreCase(filter))
                        .or(qLibadores.lbParteInformativo.containsIgnoreCase(filter))
                        .or(qLibadores.lbTipoBebida.containsIgnoreCase(filter))
//                        .or(qLibadores.lbFechaIngreso.stringValue().containsIgnoreCase(filter))
                        .or(qLibadores.lbHoraInfraccion.stringValue().containsIgnoreCase(filter))
                        .or(qLibadores.lbMinutoInfraccion.stringValue().containsIgnoreCase(filter));

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<Libadores> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }

}
