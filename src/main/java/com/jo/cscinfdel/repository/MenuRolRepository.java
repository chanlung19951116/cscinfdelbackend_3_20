package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MenuRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRolRepository extends
        JpaRepository<MenuRol, Integer>,
        PagingAndSortingRepository<MenuRol, Integer>,
        QuerydslPredicateExecutor<MenuRol> {


}
