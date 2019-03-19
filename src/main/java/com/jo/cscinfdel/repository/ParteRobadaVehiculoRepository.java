package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ParteRobadaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParteRobadaVehiculoRepository extends
        JpaRepository<ParteRobadaVehiculo, Integer>,
        PagingAndSortingRepository<ParteRobadaVehiculo, Integer>,
        QuerydslPredicateExecutor<ParteRobadaVehiculo> {


}
