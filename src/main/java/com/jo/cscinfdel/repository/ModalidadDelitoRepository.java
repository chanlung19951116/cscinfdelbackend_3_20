package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ModalidadDelito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadDelitoRepository extends
        JpaRepository<ModalidadDelito, Integer>,
        PagingAndSortingRepository<ModalidadDelito, Integer>,
        QuerydslPredicateExecutor<ModalidadDelito> {

}
