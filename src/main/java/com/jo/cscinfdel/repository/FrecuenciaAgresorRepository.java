package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.FrecuenciaAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaAgresorRepository extends
        JpaRepository<FrecuenciaAgresor, Integer>,
        PagingAndSortingRepository<FrecuenciaAgresor, Integer>,
        QuerydslPredicateExecutor<FrecuenciaAgresor> {

}
