package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AmObejtoAmenaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmObejtoAmenazaRepository extends
        JpaRepository<AmObejtoAmenaza, Integer>,
        PagingAndSortingRepository<AmObejtoAmenaza, Integer>,
        QuerydslPredicateExecutor<AmObejtoAmenaza> {


}
