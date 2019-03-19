package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AlcoholAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholAgresorRepository extends
        JpaRepository<AlcoholAgresor, Integer>,
        PagingAndSortingRepository<AlcoholAgresor, Integer>,
        QuerydslPredicateExecutor<AlcoholAgresor> {


}
