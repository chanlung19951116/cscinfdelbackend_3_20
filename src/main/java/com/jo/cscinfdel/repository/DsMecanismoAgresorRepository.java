package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.DsMecanismoAgresor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DsMecanismoAgresorRepository extends
        JpaRepository<DsMecanismoAgresor, Integer>,
        PagingAndSortingRepository<DsMecanismoAgresor, Integer>,
        QuerydslPredicateExecutor<DsMecanismoAgresor> {


}
