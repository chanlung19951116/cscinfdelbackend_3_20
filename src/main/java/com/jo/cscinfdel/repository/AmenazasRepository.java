package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Amenazas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenazasRepository extends
        JpaRepository<Amenazas, Integer>,
        PagingAndSortingRepository<Amenazas, Integer>,
        QuerydslPredicateExecutor<Amenazas> {


}
