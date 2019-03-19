package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ParroquiaDesaparicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParroquiaDesaparicionRepository extends
        JpaRepository<ParroquiaDesaparicion, Integer>,
        PagingAndSortingRepository<ParroquiaDesaparicion, Integer>,
        QuerydslPredicateExecutor<ParroquiaDesaparicion> {

}