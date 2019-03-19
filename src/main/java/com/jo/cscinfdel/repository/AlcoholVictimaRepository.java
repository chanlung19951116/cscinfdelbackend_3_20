package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AlcoholVictima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholVictimaRepository extends
        JpaRepository<AlcoholVictima, Integer>,
        PagingAndSortingRepository<AlcoholVictima, Integer>,
        QuerydslPredicateExecutor<AlcoholVictima> {


}
