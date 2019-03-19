package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.GradoAlcoholAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoAlcoholAgresorRepository extends
        JpaRepository<GradoAlcoholAgresor, Integer>,
        PagingAndSortingRepository<GradoAlcoholAgresor, Integer>,
        QuerydslPredicateExecutor<GradoAlcoholAgresor> {


}
