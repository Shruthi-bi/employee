package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emp_entity;

public interface Emp_repo extends JpaRepository<Emp_entity, Integer>{

}
