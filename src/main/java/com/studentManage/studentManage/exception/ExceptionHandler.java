package com.studentManage.studentManage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.studentManage.studentManage.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler 
{
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> getException(studentNotFoundException ex)
	{
		
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setMessage("Student Id is Not Present ");
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		rs.setData(ex.getMessage());

		
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
		
	}
}
