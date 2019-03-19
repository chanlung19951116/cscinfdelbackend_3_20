package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ServicioVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioVehiculoRepository extends
        JpaRepository<ServicioVehiculo, Integer>,
        PagingAndSortingRepository<ServicioVehiculo, Integer>,
        QuerydslPredicateExecutor<ServicioVehiculo> {

}