package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarrioRepository extends
        JpaRepository<Barrio, Integer>,
        PagingAndSortingRepository<Barrio, Integer>,
        QuerydslPredicateExecutor<Barrio> {


}
