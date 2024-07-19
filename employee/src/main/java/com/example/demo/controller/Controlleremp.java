package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Emp_entity;
import com.example.demo.service.Emp_service;

public class Controlleremp {
@Autowired
private Emp_service service;
@PostMapping("/save")
public ResponseEntity<Emp_entity> saveEmp(Emp_entity obj){
	String s=service.saveEmp(obj);
	return ResponseEntity.status(HttpStatus.OK).body(obj);
	
}

}
