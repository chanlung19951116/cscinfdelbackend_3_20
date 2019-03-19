package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends
        JpaRepository<TipoUsuario, Integer>,
        PagingAndSortingRepository<TipoUsuario, Integer>,
        QuerydslPredicateExecutor<TipoUsuario> {


}
