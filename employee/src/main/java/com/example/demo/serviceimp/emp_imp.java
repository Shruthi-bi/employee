package com.example.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Emp_entity;
import com.example.demo.repo.Emp_repo;
import com.example.demo.service.Emp_service;

public class emp_imp implements  Emp_service{
@Autowired
private Emp_repo repo;//we have to create obj

@Override
public String saveEmp(Emp_entity obj) {
	repo.save(obj);
	return "Saved";
}

@Override
public List<Emp_entity> getall() {
	repo.findAll();
	return null;
}

@Override
public String delete(int id) {
	repo.deleteById(id);
	return "deleted";
}

@Override
public String update(int id, String name) {
	Emp_entity obj=repo.findById(id).get();
	obj.setName(name);
	return null;
}

}






