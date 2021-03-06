package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.PdCondicionRegresaDesaparecido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdCondicionRegresaDesaparecidoRepository extends
        JpaRepository<PdCondicionRegresaDesaparecido, Integer>,
        PagingAndSortingRepository<PdCondicionRegresaDesaparecido, Integer>,
        QuerydslPredicateExecutor<PdCondicionRegresaDesaparecido> {


}
