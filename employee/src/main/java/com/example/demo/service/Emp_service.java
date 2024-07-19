package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Emp_entity;

public interface Emp_service {
public String saveEmp(Emp_entity obj);

public List<Emp_entity> getall();
public String update(int id ,String name);
public String delete(int id);




}
