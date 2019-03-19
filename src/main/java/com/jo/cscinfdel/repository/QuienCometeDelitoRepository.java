package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.QuienCometeDelito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuienCometeDelitoRepository extends
        JpaRepository<QuienCometeDelito, Integer>,
        PagingAndSortingRepository<QuienCometeDelito, Integer>,
        QuerydslPredicateExecutor<QuienCometeDelito> {

}
