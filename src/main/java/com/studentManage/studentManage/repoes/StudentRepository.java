package com.studentManage.studentManage.repoes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManage.studentManage.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
