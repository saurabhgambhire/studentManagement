package com.studentManage.studentManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.studentManage.studentManage.dao.StudentDao;
import com.studentManage.studentManage.dto.Student;
import com.studentManage.studentManage.util.ResponseStructure;

public class StudentService {
	
	@Autowired
     private StudentDao dao;

	public ResponseStructure<Student> saveStudent(Student student) 	
	{
		Student stud = dao.saveStudent(student);
		
		if (stud!=null) {
			
			ResponseStructure<Student> rs = new ResponseStructure<Student>();
			rs.setMessage("Student Saved Successfully :) ");
			rs.setStatus(HttpStatus.CREATED.value());
			rs.setData(stud);
			return rs;

		}

		return null;

	}

}
