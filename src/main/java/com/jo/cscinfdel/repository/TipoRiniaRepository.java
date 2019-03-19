package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoRinia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRiniaRepository extends
        JpaRepository<TipoRinia, Integer>,
        PagingAndSortingRepository<TipoRinia, Integer>,
        QuerydslPredicateExecutor<TipoRinia> {


}
