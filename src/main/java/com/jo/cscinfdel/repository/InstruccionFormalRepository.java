package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.InstruccionFormal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstruccionFormalRepository extends
        JpaRepository<InstruccionFormal, Integer>,
        PagingAndSortingRepository<InstruccionFormal, Integer>,
        QuerydslPredicateExecutor<InstruccionFormal> {

}