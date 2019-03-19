package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends
        JpaRepository<Vendedor, Integer>,
        PagingAndSortingRepository<Vendedor, Integer>,
        QuerydslPredicateExecutor<Vendedor> {


}
