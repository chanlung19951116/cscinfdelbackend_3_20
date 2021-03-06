package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.LesionVictima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LesionVictimaRepository extends
        JpaRepository<LesionVictima, Integer>,
        PagingAndSortingRepository<LesionVictima, Integer>,
        QuerydslPredicateExecutor<LesionVictima> {

}
