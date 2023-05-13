package com.studentManage.studentManage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentManage.studentManage.dto.Student;
import com.studentManage.studentManage.repoes.StudentRepository;
@Repository
public class StudentDao 
{
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}

}
