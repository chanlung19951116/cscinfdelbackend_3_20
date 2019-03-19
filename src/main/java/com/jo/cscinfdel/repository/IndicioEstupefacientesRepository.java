package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.IndicioEstupefacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicioEstupefacientesRepository extends
        JpaRepository<IndicioEstupefacientes, Integer>,
        PagingAndSortingRepository<IndicioEstupefacientes, Integer>,
        QuerydslPredicateExecutor<IndicioEstupefacientes> {

}
