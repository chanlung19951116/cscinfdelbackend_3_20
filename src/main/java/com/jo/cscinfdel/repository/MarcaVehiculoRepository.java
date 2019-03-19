package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.MarcaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaVehiculoRepository extends
        JpaRepository<MarcaVehiculo, Integer>,
        PagingAndSortingRepository<MarcaVehiculo, Integer>,
        QuerydslPredicateExecutor<MarcaVehiculo> {

}
