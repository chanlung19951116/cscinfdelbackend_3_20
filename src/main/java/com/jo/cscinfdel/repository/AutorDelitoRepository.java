package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AutorDelito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDelitoRepository extends
        JpaRepository<AutorDelito, Integer>,
        PagingAndSortingRepository<AutorDelito, Integer>,
        QuerydslPredicateExecutor<AutorDelito> {


}
