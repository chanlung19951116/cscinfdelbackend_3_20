package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.CausaAccidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaAccidenteRepository extends
        JpaRepository<CausaAccidente, Integer>,
        PagingAndSortingRepository<CausaAccidente, Integer>,
        QuerydslPredicateExecutor<CausaAccidente> {


}
