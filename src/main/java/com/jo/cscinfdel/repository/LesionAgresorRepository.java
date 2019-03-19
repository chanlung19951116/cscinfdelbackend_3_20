package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.LesionAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LesionAgresorRepository extends
        JpaRepository<LesionAgresor, Integer>,
        PagingAndSortingRepository<LesionAgresor, Integer>,
        QuerydslPredicateExecutor<LesionAgresor> {

}
