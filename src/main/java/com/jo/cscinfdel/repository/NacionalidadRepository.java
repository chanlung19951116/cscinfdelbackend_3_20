package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Nacionalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadRepository extends
        JpaRepository<Nacionalidad, Integer>,
        PagingAndSortingRepository<Nacionalidad, Integer>,
        QuerydslPredicateExecutor<Nacionalidad> {


}
