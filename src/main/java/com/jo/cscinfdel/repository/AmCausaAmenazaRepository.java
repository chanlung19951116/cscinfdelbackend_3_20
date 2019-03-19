package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AmCausaAmenaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmCausaAmenazaRepository extends
        JpaRepository<AmCausaAmenaza, Integer>,
        PagingAndSortingRepository<AmCausaAmenaza, Integer>,
        QuerydslPredicateExecutor<AmCausaAmenaza> {


}
