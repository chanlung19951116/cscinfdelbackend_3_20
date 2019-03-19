package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.DatosGeoReferenciacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosGeoReferenciacionRepository extends
        JpaRepository<DatosGeoReferenciacion, Integer>,
        PagingAndSortingRepository<DatosGeoReferenciacion, Integer>,
        QuerydslPredicateExecutor<DatosGeoReferenciacion> {


}
