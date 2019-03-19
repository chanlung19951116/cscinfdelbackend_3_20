package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.RobosHurtosGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobosHurtosGeneralRepository extends
        JpaRepository<RobosHurtosGeneral, Integer>,
        PagingAndSortingRepository<RobosHurtosGeneral, Integer>,
        QuerydslPredicateExecutor<RobosHurtosGeneral> {


}
