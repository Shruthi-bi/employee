package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp_entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Emp_entiry [id=" + id + ", name=" + name + ", age=" + age + "]";
}
public Emp_entity(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public Emp_entity() {
	super();
	// TODO Auto-generated constructor stub
}


}
