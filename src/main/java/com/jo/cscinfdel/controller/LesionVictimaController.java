package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.QLesionVictima;
import com.jo.cscinfdel.model.LesionVictima;
import com.jo.cscinfdel.repository.LesionVictimaRepository;
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
@RequestMapping("/LesionVictima")
public class LesionVictimaController {

    @Autowired
    private LesionVictimaRepository repository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<LesionVictima> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody LesionVictima object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public LesionVictima create(@RequestBody LesionVictima object) {

        LesionVictima result = repository.save(object);
        result.setLesiones(null);

        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public LesionVictima update(@RequestBody LesionVictima object) {

        LesionVictima result = repository.save(object);
        result.setLesiones(null);

        return result;
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
        List<LesionVictima> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {

        QLesionVictima qLesionVictima = QLesionVictima.lesionVictima;

        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }

        Predicate predicate =
                qLesionVictima.victima.victimaNombreCompleto.containsIgnoreCase(filter);

        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count(predicate);
        List<LesionVictima> items = repository.findAll(predicate, pageRequest)
                .getContent();

        items.forEach(lesionVictima -> {
            lesionVictima.setLesiones(null);
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }


}

