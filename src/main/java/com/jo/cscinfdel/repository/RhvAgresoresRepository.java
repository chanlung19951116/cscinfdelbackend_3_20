package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.RhvAgresores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhvAgresoresRepository extends
        JpaRepository<RhvAgresores, Integer>,
        PagingAndSortingRepository<RhvAgresores, Integer>,
        QuerydslPredicateExecutor<RhvAgresores> {

}
