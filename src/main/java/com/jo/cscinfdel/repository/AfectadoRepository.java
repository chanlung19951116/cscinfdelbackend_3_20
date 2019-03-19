package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Afectado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfectadoRepository extends
        JpaRepository<Afectado, Integer>,
        PagingAndSortingRepository<Afectado, Integer>,
        QuerydslPredicateExecutor<Afectado> {

}