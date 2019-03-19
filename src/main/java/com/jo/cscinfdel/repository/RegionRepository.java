package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends
        JpaRepository<Region, Integer>,
        PagingAndSortingRepository<Region, Integer>,
        QuerydslPredicateExecutor<Region> {

}