package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoDiscapacidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDiscapacidadRepository extends
        JpaRepository<TipoDiscapacidad, Integer>,
        PagingAndSortingRepository<TipoDiscapacidad, Integer>,
        QuerydslPredicateExecutor<TipoDiscapacidad> {

}