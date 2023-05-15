package com.studentManage.studentManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.studentManage.studentManage.dao.StudentDao;
import com.studentManage.studentManage.dto.Student;
import com.studentManage.studentManage.exception.studentNotFoundException;
import com.studentManage.studentManage.util.ResponseStructure;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;

	public ResponseStructure<Student> saveStudent(Student student) {
		Student stud = dao.saveStudent(student);

		if (stud != null) {

			ResponseStructure<Student> rs = new ResponseStructure<Student>();
			rs.setMessage("Student Saved Successfully :) ");
			rs.setStatus(HttpStatus.CREATED.value());
			rs.setData(stud);
			return rs;

		}

		return null;

	}

	public ResponseStructure<Student> findStudent(int id) {
		// TODO Auto-generated method stub
		Student student = dao.findStudent(id);
		if (student != null) {
			ResponseStructure<Student> rs = new ResponseStructure<>();
			rs.setMessage("Student found ");
			rs.setStatus(HttpStatus.FOUND.value());
			rs.setData(student);

			return rs;

		}
		throw new studentNotFoundException(" Student Not Found ");
	}

	public ResponseStructure<Student> findAllStudents() {
		List<Student> students = dao.findAllStudents();

		if (students != null) {
			ResponseStructure<Student> rs = new ResponseStructure<Student>();
			for (Student student : students) {

				rs.setMessage("All Student ");
				rs.setStatus(HttpStatus.FOUND.value());
				rs.setData(student);
				return rs;
			}
		}
		return null;
	}

}
