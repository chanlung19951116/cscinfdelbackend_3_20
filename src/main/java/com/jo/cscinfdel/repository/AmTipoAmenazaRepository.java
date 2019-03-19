package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.AmTipoAmenaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmTipoAmenazaRepository extends
        JpaRepository<AmTipoAmenaza, Integer>,
        PagingAndSortingRepository<AmTipoAmenaza, Integer>,
        QuerydslPredicateExecutor<AmTipoAmenaza> {


}
