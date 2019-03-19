package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ObjetoHurtado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoHurtadoRepository extends
        JpaRepository<ObjetoHurtado, Integer>,
        PagingAndSortingRepository<ObjetoHurtado, Integer>,
        QuerydslPredicateExecutor<ObjetoHurtado> {

}