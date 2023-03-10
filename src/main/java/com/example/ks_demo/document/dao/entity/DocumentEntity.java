package com.example.ks_demo.document.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DocumentEntity {
    @Id
    @GeneratedValue
    private Long id;


}
