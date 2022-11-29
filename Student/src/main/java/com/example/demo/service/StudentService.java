package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	void save(Student s);
	List<Student> getAll();
	void saveAll(List<Student> StuList);

}
