package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.OtrosDelitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtrosDelitosRepository extends
        JpaRepository<OtrosDelitos, Integer>,
        PagingAndSortingRepository<OtrosDelitos, Integer>,
        QuerydslPredicateExecutor<OtrosDelitos> {


}
