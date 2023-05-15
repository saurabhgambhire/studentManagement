package com.studentManage.studentManage.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentManage.studentManage.dto.Student;
import com.studentManage.studentManage.repoes.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Student findStudent(int id) {
		Optional<Student> optional = repository.findById(id);
		Student student = optional.get();
		return student;
	}

	public List<Student> findAllStudents() {
			
		List<Student> list = repository.findAll();
		return list;
	}

}
