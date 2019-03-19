package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MuertesViolentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuertesViolentasRepository extends
        JpaRepository<MuertesViolentas, Integer>,
        PagingAndSortingRepository<MuertesViolentas, Integer>,
        QuerydslPredicateExecutor<MuertesViolentas> {


}
