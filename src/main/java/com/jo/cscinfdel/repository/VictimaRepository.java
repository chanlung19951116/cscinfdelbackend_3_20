package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Victima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VictimaRepository extends
        JpaRepository<Victima, Integer>,
        PagingAndSortingRepository<Victima, Integer>,
        QuerydslPredicateExecutor<Victima> {


}
