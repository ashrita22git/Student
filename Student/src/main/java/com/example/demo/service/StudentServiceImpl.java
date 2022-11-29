package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo sr;

	@Override
	public void save(Student s) {
		sr.save(s);
		
	}

	@Override
	public List<Student> getAll() {
		List<Student> ls = sr.findAll();
		return ls;
	}

	@Override
	public void saveAll(List<Student> stuList) {
		sr.saveAll(stuList);
		
	}

}
