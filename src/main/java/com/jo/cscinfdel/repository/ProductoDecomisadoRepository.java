package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ProductoDecomisado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDecomisadoRepository extends
        JpaRepository<ProductoDecomisado, Integer>,
        PagingAndSortingRepository<ProductoDecomisado, Integer>,
        QuerydslPredicateExecutor<ProductoDecomisado> {

}
