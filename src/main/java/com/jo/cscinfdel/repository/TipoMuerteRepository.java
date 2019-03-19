package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoMuerte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMuerteRepository extends
        JpaRepository<TipoMuerte, Integer>,
        PagingAndSortingRepository<TipoMuerte, Integer>,
        QuerydslPredicateExecutor<TipoMuerte> {


}