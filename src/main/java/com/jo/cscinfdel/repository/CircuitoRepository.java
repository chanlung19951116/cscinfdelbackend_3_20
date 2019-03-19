package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends
        JpaRepository<Circuito, Integer>,
        PagingAndSortingRepository<Circuito, Integer>,
        QuerydslPredicateExecutor<Circuito> {


}
