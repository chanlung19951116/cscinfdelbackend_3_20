package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Parroquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ParroquiaRepository extends
        JpaRepository<Parroquia, Integer>,
        PagingAndSortingRepository<Parroquia, Integer>,
        QuerydslPredicateExecutor<Parroquia> {


}
