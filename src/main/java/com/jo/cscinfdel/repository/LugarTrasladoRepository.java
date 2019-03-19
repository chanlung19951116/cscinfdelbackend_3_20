package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.LugarTraslado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarTrasladoRepository extends
        JpaRepository<LugarTraslado, Integer>,
        PagingAndSortingRepository<LugarTraslado, Integer>,
        QuerydslPredicateExecutor<LugarTraslado> {

}
