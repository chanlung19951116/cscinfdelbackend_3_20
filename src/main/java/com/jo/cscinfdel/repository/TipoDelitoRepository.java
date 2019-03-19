package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoDelito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDelitoRepository extends
        JpaRepository<TipoDelito, Integer>,
        PagingAndSortingRepository<TipoDelito, Integer>,
        QuerydslPredicateExecutor<TipoDelito> {


}
