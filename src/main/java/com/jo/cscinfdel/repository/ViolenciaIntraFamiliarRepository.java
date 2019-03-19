package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ViolenciaIntraFamiliar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViolenciaIntraFamiliarRepository extends
        JpaRepository<ViolenciaIntraFamiliar, Integer>,
        PagingAndSortingRepository<ViolenciaIntraFamiliar, Integer>,
        QuerydslPredicateExecutor<ViolenciaIntraFamiliar> {


}
