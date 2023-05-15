package com.studentManage.studentManage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentManage.studentManage.dto.Student;
import com.studentManage.studentManage.service.StudentService;
import com.studentManage.studentManage.util.ResponseStructure;

@RestController 
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@PostMapping
	public ResponseStructure<Student> saveStudent(@RequestBody Student student)
	{
		 return service.saveStudent(student);
	}
	
	@GetMapping
	public ResponseStructure<Student> findStudent(@RequestParam int id)
	{
		return service.findStudent(id);
	}
	
	@GetMapping("/findall")
	public ResponseStructure<Student> findAllStudents()
	{
		return service.findAllStudents();
	}
	

}
