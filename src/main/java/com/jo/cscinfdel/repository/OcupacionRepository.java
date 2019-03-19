package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Ocupacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacionRepository extends
        JpaRepository<Ocupacion, Integer>,
        PagingAndSortingRepository<Ocupacion, Integer>,
        QuerydslPredicateExecutor<Ocupacion> {


}
