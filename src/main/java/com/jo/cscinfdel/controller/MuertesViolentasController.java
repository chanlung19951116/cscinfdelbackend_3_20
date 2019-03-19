package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.MuertesViolentas;
import com.jo.cscinfdel.model.QMuertesViolentas;
import com.jo.cscinfdel.repository.MuertesViolentasRepository;
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
@RequestMapping("/MuertesViolentas")
public class MuertesViolentasController {

    @Autowired
    private MuertesViolentasRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<MuertesViolentas> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody MuertesViolentas object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public MuertesViolentas create(@RequestBody MuertesViolentas object) {

        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public MuertesViolentas update(@RequestBody MuertesViolentas object) {

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
        List<MuertesViolentas> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QMuertesViolentas qMuertesViolentas = QMuertesViolentas.muertesViolentas;


        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate = qMuertesViolentas.mvNumeroExpediente.containsIgnoreCase(filter)
                .or(qMuertesViolentas.mvNumeroExpediente.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvHoraLevantamiento.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvFehaHecho.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvDireccion.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvHistorialClinico.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvDisect.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvObservaciones.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvCodigoDigitadorActual.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvArchivo.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvArchivo2.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvTipoVehiculoVictima.containsIgnoreCase(filter))
                .or(qMuertesViolentas.mvMuerteViolentaPol.containsIgnoreCase(filter));

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<MuertesViolentas> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }

}
