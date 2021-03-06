package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.DsContinuidadCaso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DsContinuidadCasoRepository extends
        JpaRepository<DsContinuidadCaso, Integer>,
        PagingAndSortingRepository<DsContinuidadCaso, Integer>,
        QuerydslPredicateExecutor<DsContinuidadCaso> {


}
