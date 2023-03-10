package com.example.ks_demo.document.dao.repository;

import com.example.ks_demo.document.dao.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity , Long> {
}
