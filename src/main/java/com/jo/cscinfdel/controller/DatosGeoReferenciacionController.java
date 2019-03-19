package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.DatosGeoReferenciacion;
import com.jo.cscinfdel.model.QDatosGeoReferenciacion;
import com.jo.cscinfdel.repository.DatosGeoReferenciacionRepository;
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
@RequestMapping("/DatosGeoReferenciacion")
public class DatosGeoReferenciacionController {

    @Autowired
    private DatosGeoReferenciacionRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<DatosGeoReferenciacion> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody DatosGeoReferenciacion object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public DatosGeoReferenciacion create(@RequestBody DatosGeoReferenciacion object) {


        return repository.save(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DatosGeoReferenciacion update(@RequestBody DatosGeoReferenciacion object) {

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
        List<DatosGeoReferenciacion> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QDatosGeoReferenciacion qDatosGeoReferenciacion = QDatosGeoReferenciacion.datosGeoReferenciacion;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qDatosGeoReferenciacion.geoRefCoordenadaX.stringValue().containsIgnoreCase(filter)
                        .or(qDatosGeoReferenciacion.geoRefCoordenadaY.stringValue().containsIgnoreCase(filter))
                        .or(qDatosGeoReferenciacion.parroquia.descripcion.containsIgnoreCase(filter))
                        .or(qDatosGeoReferenciacion.zona.descripcion.containsIgnoreCase(filter))
                        .or(qDatosGeoReferenciacion.circuito.descripcion.containsIgnoreCase(filter))
                        .or(qDatosGeoReferenciacion.distrito.descripcion.containsIgnoreCase(filter));


        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<DatosGeoReferenciacion> items = repository.findAll(predicate, pageRequest)
                .getContent();

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }

}
