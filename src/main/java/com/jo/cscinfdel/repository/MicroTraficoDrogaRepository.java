package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MicroTraficoDroga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroTraficoDrogaRepository extends
        JpaRepository<MicroTraficoDroga, Integer>,
        PagingAndSortingRepository<MicroTraficoDroga, Integer>,
        QuerydslPredicateExecutor<MicroTraficoDroga> {

}