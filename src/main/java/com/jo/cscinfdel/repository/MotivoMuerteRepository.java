package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MotivoMuerte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoMuerteRepository extends
        JpaRepository<MotivoMuerte, Integer>,
        PagingAndSortingRepository<MotivoMuerte, Integer>,
        QuerydslPredicateExecutor<MotivoMuerte> {

}
