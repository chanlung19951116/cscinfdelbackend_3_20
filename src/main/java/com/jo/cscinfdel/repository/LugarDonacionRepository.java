package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.LugarDonacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarDonacionRepository extends
        JpaRepository<LugarDonacion, Integer>,
        PagingAndSortingRepository<LugarDonacion, Integer>,
        QuerydslPredicateExecutor<LugarDonacion> {

}
