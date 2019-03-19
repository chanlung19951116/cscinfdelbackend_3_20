package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ProcedenciaGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedenciaGrupoRepository extends
        JpaRepository<ProcedenciaGrupo, Integer>,
        PagingAndSortingRepository<ProcedenciaGrupo, Integer>,
        QuerydslPredicateExecutor<ProcedenciaGrupo> {


}
