package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.DrogaSustancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrogaSustanciaRepository extends
        JpaRepository<DrogaSustancia, Integer>,
        PagingAndSortingRepository<DrogaSustancia, Integer>,
        QuerydslPredicateExecutor<DrogaSustancia> {


}
