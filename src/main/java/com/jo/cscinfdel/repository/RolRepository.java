package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer>,
        PagingAndSortingRepository<Rol, Integer>,
        QuerydslPredicateExecutor<Rol> {

}