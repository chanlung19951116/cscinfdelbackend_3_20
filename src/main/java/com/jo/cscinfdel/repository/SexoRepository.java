package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends
        JpaRepository<Sexo, Integer>,
        PagingAndSortingRepository<Sexo, Integer>,
        QuerydslPredicateExecutor<Sexo> {

}