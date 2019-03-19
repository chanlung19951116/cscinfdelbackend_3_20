package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpresaRepository extends
        JpaRepository<TipoEmpresa, Integer>,
        PagingAndSortingRepository<TipoEmpresa, Integer>,
        QuerydslPredicateExecutor<TipoEmpresa> {


}
