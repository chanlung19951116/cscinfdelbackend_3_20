package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ZonaRepository extends
        JpaRepository<Zona, Integer>,
        PagingAndSortingRepository<Zona, Integer>,
        QuerydslPredicateExecutor<Zona> {


}
