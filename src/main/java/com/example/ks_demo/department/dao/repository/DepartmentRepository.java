package com.example.ks_demo.department.dao.repository;

import com.example.ks_demo.department.dao.entity.DepartmentEntity;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity , Long> {
}
