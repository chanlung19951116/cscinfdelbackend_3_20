package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends
        JpaRepository<Usuarios, Integer>,
        PagingAndSortingRepository<Usuarios, Integer>,
        QuerydslPredicateExecutor<Usuarios> {


}
