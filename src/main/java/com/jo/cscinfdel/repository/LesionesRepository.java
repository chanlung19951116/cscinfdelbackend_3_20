package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Lesiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LesionesRepository extends
        JpaRepository<Lesiones, Integer>,
        PagingAndSortingRepository<Lesiones, Integer>,
        QuerydslPredicateExecutor<Lesiones> {


}
