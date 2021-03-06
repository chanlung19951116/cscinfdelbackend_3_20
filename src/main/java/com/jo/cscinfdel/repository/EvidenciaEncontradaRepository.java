package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.EvidenciaEncontrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvidenciaEncontradaRepository extends
        JpaRepository<EvidenciaEncontrada, Integer>,
        PagingAndSortingRepository<EvidenciaEncontrada, Integer>,
        QuerydslPredicateExecutor<EvidenciaEncontrada> {


}
