package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.PersonasDesaparecidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasDesaparecidasRepository extends
        JpaRepository<PersonasDesaparecidas, Integer>,
        PagingAndSortingRepository<PersonasDesaparecidas, Integer>,
        QuerydslPredicateExecutor<PersonasDesaparecidas> {


}
