package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ArmMedioSuceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmMedioSucesoRepository extends
        JpaRepository<ArmMedioSuceso, Integer>,
        PagingAndSortingRepository<ArmMedioSuceso, Integer>,
        QuerydslPredicateExecutor<ArmMedioSuceso> {


}
