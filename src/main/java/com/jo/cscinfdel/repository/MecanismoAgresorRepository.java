package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MecanismoAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanismoAgresorRepository extends
        JpaRepository<MecanismoAgresor, Integer>,
        PagingAndSortingRepository<MecanismoAgresor, Integer>,
        QuerydslPredicateExecutor<MecanismoAgresor> {

}