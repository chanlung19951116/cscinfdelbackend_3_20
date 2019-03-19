package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarRepository extends
        JpaRepository<Lugar, Integer>,
        PagingAndSortingRepository<Lugar, Integer>,
        QuerydslPredicateExecutor<Lugar> {


}
