package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Descadenante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescadenanteRepository extends
        JpaRepository<Descadenante, Integer>,
        PagingAndSortingRepository<Descadenante, Integer>,
        QuerydslPredicateExecutor<Descadenante> {


}
