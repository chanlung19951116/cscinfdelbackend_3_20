package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends
        JpaRepository<Vehiculo, Integer>,
        PagingAndSortingRepository<Vehiculo, Integer>,
        QuerydslPredicateExecutor<Vehiculo> {


}
