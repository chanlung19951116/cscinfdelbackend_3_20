package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ModeloVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloVehiculoRepository extends
        JpaRepository<ModeloVehiculo, Integer>,
        PagingAndSortingRepository<ModeloVehiculo, Integer>,
        QuerydslPredicateExecutor<ModeloVehiculo> {


}
