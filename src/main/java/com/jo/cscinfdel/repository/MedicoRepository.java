package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends
        JpaRepository<Medico, Integer>,
        PagingAndSortingRepository<Medico, Integer>,
        QuerydslPredicateExecutor<Medico> {


}
