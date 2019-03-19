package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.SustanciaMicroTrafico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SustanciaMicroTraficoRepository extends
        JpaRepository<SustanciaMicroTrafico, Integer>,
        PagingAndSortingRepository<SustanciaMicroTrafico, Integer>,
        QuerydslPredicateExecutor<SustanciaMicroTrafico> {


}
