package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends
        JpaRepository<Menu, Integer>,
        PagingAndSortingRepository<Menu, Integer>,
        QuerydslPredicateExecutor<Menu> {


}
