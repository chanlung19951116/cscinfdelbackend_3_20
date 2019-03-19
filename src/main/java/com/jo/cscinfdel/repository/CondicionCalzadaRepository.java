package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.CondicionCalzada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionCalzadaRepository extends
        JpaRepository<CondicionCalzada, Integer>,
        PagingAndSortingRepository<CondicionCalzada, Integer>,
        QuerydslPredicateExecutor<CondicionCalzada> {


}
