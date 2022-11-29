package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@PostMapping("/save")
	
	String save(@RequestBody Student s) {
		ss.save(s);
		return "Record is added Successfully";
	}
	
	@GetMapping("/display")
	@ResponseBody
	List<Student> getAll(){
		List<Student> ls = ss.getAll();
		return ls;
	}
	
	@PostMapping("/saveAll")
	String saveAll(@RequestBody List<Student> StuList) {
		ss.saveAll(StuList);
		return "All records are added successfully";
	}
	

}
