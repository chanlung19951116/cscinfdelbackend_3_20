package com.jo.cscinfdel.controller;

import com.jo.cscinfdel.model.*;
import com.jo.cscinfdel.repository.MenuRepository;
import com.jo.cscinfdel.repository.MenuRolRepository;
import com.jo.cscinfdel.repository.RolRepository;
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
import java.util.Optional;

@RestController
@RequestMapping("/MenuRol")
public class MenuRolController {

    @Autowired
    private MenuRolRepository repository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private RolRepository rolRepository;

    @RequestMapping(value = "/read-all", method = RequestMethod.GET)
    public List<MenuRol> readAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody MenuRol object) {
        repository.delete(object);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public MenuRol create(@RequestBody MenuRol object) {

        Optional<Menu> menuOptional = menuRepository.findOne(QMenu.menu.codigo.eq(object.getId().getMenucodigo()));
        Optional<Rol> rolOptional = rolRepository.findOne(QRol.rol.codigo.eq(object.getId().getRolcodigo()));

        if (menuOptional.isPresent() && rolOptional.isPresent()) {
            object.setMenu(menuOptional.get());
            object.setRol(rolOptional.get());
        }

        repository.save(object);

        object.setMenu(null);
        object.setRol(null);
        return object;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public MenuRol update(@RequestBody MenuRol object) {

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
        List<MenuRol> items;
    }

    @RequestMapping(value = "/get-by-page-and-filter", method = RequestMethod.POST)
    public ResponseBody4GetByPageAndFilter getByPageAndFilter(@RequestBody RequestBody4GetByPageAndFilter requestBody) {



        String filter = requestBody.filter;
        if (filter == null) {
            filter = "";
        }


        PageRequest pageRequest = PageRequest.of(requestBody.pageNumber, requestBody.pageSize);

        Long totalCount = repository.count();
        List<MenuRol> items = repository.findAll(pageRequest)
                .getContent();

        items.forEach(menuRol -> {
            menuRol.getRol().setMenuRolList(null);
        });

        return new ResponseBody4GetByPageAndFilter(totalCount, items);

    }
}

