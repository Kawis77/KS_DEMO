package com.example.ks_demo.department.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class DepartmentEntity {
    @Id
    @GeneratedValue
    private Long id;


}
