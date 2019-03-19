package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Etnia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtniaRepository extends
        JpaRepository<Etnia, Integer>,
        PagingAndSortingRepository<Etnia, Integer>,
        QuerydslPredicateExecutor<Etnia> {

}