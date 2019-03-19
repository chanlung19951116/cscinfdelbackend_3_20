package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AccidenteTransito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidenteTransitoRepository extends
        JpaRepository<AccidenteTransito, Integer>,
        PagingAndSortingRepository<AccidenteTransito, Integer>,
        QuerydslPredicateExecutor<AccidenteTransito> {


}
