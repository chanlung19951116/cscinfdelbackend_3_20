package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ClaseAccidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseAccidenteRepository extends
        JpaRepository<ClaseAccidente, Integer>,
        PagingAndSortingRepository<ClaseAccidente, Integer>,
        QuerydslPredicateExecutor<ClaseAccidente> {


}
