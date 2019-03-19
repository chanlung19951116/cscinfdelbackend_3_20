package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Fiscalia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscaliaRepository extends
        JpaRepository<Fiscalia, Integer>,
        PagingAndSortingRepository<Fiscalia, Integer>,
        QuerydslPredicateExecutor<Fiscalia> {

}