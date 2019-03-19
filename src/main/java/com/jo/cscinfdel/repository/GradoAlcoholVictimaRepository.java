package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.GradoAlcoholVictima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoAlcoholVictimaRepository extends
        JpaRepository<GradoAlcoholVictima, Integer>,
        PagingAndSortingRepository<GradoAlcoholVictima, Integer>,
        QuerydslPredicateExecutor<GradoAlcoholVictima> {


}
