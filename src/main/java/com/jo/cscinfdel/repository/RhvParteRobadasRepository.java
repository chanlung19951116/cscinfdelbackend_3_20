package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.RhvParteRobadas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhvParteRobadasRepository extends
        JpaRepository<RhvParteRobadas, Integer>,
        PagingAndSortingRepository<RhvParteRobadas, Integer>,
        QuerydslPredicateExecutor<RhvParteRobadas> {


}
