package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVehiculoRepository extends
        JpaRepository<TipoVehiculo, Integer>,
        PagingAndSortingRepository<TipoVehiculo, Integer>,
        QuerydslPredicateExecutor<TipoVehiculo> {

}
