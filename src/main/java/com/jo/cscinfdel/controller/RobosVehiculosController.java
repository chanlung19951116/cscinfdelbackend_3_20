package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.QRhvParteRobadas;
import com.jo.cscinfdel.model.RhvParteRobadas;
import com.jo.cscinfdel.model.RobosVehiculos;
import com.jo.cscinfdel.model.QRobosVehiculos;
import com.jo.cscinfdel.repository.RhvParteRobadasRepository;
import com.jo.cscinfdel.repository.RobosVehiculosRepository;
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
@RequestMapping("/RobosVehiculos")
public class RobosVehiculosController {

    @Autowired
    private RobosVehiculosRepository repository;

    @Autowired
    private RhvParteRobadasRepository rhvParteRobadasRepository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<RobosVehiculos> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody RobosVehiculos object) {

        QRhvParteRobadas qRhvParteRobadas = QRhvParteRobadas.rhvParteRobadas;

        Predicate predicate = qRhvParteRobadas.id.rvCodigoUnico.eq(object.getRvCodigoUnico());

        this.rhvParteRobadasRepository.deleteAll(this.rhvParteRobadasRepository.findAll(predicate));

        object.setRhvParteRobadasList(null);

        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public RobosVehiculos create(@RequestBody RobosVehiculos object) {

        return this.saveObject(object);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RobosVehiculos update(@RequestBody RobosVehiculos object) {

        return this.saveObject(object);
    }


    private RobosVehiculos saveObject(RobosVehiculos object) {
        Set<RhvParteRobadas> rhvParteRobadasList = object.getRhvParteRobadasList();
        if (rhvParteRobadasList == null) {
            rhvParteRobadasList = new HashSet<>();
        }
        object.setRhvParteRobadasList(null);

        object = repository.save(object);

        RobosVehiculos finalObject = object;
        rhvParteRobadasList.forEach(item -> {
            item.setRobosVehiculos(finalObject);
        });
        QRhvParteRobadas qRhvParteRobadas = QRhvParteRobadas.rhvParteRobadas;

        Predicate predicate = qRhvParteRobadas.id.rvCodigoUnico.eq(object.getRvCodigoUnico());

        this.rhvParteRobadasRepository.deleteAll(this.rhvParteRobadasRepository.findAll(predicate));

        this.rhvParteRobadasRepository.saveAll(rhvParteRobadasList);

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
        List<RobosVehiculos> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QRobosVehiculos qRobosVehiculos = QRobosVehiculos.robosVehiculos;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qRobosVehiculos.rvNumeroExpediente.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<RobosVehiculos> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(robosVehiculos -> {
            robosVehiculos.getRhvParteRobadasList().forEach(rhvParteRobadas -> {
                rhvParteRobadas.setRobosVehiculos(null);
            });
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }


}

