package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.CausaAmenaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaAmenazaRepository extends
        JpaRepository<CausaAmenaza, Integer>,
        PagingAndSortingRepository<CausaAmenaza, Integer>,
        QuerydslPredicateExecutor<CausaAmenaza> {


}
