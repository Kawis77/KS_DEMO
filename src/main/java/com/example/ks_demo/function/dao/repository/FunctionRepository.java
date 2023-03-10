package com.example.ks_demo.function.dao.repository;

import com.example.ks_demo.function.dao.entity.FunctionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRepository extends JpaRepository<FunctionEntity , Long> {
}
