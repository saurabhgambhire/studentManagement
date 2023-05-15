package com.studentManage.studentManage.exception;

public class studentNotFoundException extends RuntimeException
{
	 private String message;
	 
	 public studentNotFoundException()
	 {}
	
	public studentNotFoundException(String message)
	{
		super();
		this.message = message;
	}

}
