package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoEmpresaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpresaVehiculoRepository extends
        JpaRepository<TipoEmpresaVehiculo, Integer>,
        PagingAndSortingRepository<TipoEmpresaVehiculo, Integer>,
        QuerydslPredicateExecutor<TipoEmpresaVehiculo> {

}