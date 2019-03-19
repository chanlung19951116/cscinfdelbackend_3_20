package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ParentezcoPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentezcoPersonaRepository extends
        JpaRepository<ParentezcoPersona, Integer>,
        PagingAndSortingRepository<ParentezcoPersona, Integer>,
        QuerydslPredicateExecutor<ParentezcoPersona> {


}
