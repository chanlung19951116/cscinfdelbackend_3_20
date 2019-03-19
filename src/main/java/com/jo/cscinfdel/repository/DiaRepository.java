package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaRepository extends
        JpaRepository<Dia, Integer>,
        PagingAndSortingRepository<Dia, Integer>,
        QuerydslPredicateExecutor<Dia> {


}
