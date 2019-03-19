package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ModalidadRobo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadRoboRepository extends
        JpaRepository<ModalidadRobo, Integer>,
        PagingAndSortingRepository<ModalidadRobo, Integer>,
        QuerydslPredicateExecutor<ModalidadRobo> {

}
