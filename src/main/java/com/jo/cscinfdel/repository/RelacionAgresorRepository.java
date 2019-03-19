package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.RelacionAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacionAgresorRepository extends
        JpaRepository<RelacionAgresor, Integer>,
        PagingAndSortingRepository<RelacionAgresor, Integer>,
        QuerydslPredicateExecutor<RelacionAgresor> {

}