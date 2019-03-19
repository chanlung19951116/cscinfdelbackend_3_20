package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.LugarLevantamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarLevantamientoRepository extends
        JpaRepository<LugarLevantamiento, Integer>,
        PagingAndSortingRepository<LugarLevantamiento, Integer>,
        QuerydslPredicateExecutor<LugarLevantamiento> {

}
