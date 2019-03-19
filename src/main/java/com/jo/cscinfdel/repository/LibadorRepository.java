package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Libador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibadorRepository extends
        JpaRepository<Libador, Integer>,
        PagingAndSortingRepository<Libador, Integer>,
        QuerydslPredicateExecutor<Libador> {

}
