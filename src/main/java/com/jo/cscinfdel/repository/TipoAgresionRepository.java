package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoAgresion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAgresionRepository extends
        JpaRepository<TipoAgresion, Integer>,
        PagingAndSortingRepository<TipoAgresion, Integer>,
        QuerydslPredicateExecutor<TipoAgresion> {


}

