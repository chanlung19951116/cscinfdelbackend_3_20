package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.RestoVictima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestoVictimaRepository extends
        JpaRepository<RestoVictima, Integer>,
        PagingAndSortingRepository<RestoVictima, Integer>,
        QuerydslPredicateExecutor<RestoVictima> {

}