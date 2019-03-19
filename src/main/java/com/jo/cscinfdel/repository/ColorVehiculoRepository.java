package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ColorVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorVehiculoRepository extends
        JpaRepository<ColorVehiculo, Integer>,
        PagingAndSortingRepository<ColorVehiculo, Integer>,
        QuerydslPredicateExecutor<ColorVehiculo> {


}
