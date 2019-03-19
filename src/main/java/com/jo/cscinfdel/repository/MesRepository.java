package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Mes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesRepository extends
        JpaRepository<Mes, Integer>,
        PagingAndSortingRepository<Mes, Integer>,
        QuerydslPredicateExecutor<Mes> {


}
