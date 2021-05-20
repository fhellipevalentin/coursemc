package com.example.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	private List<FieldMassage> errors = new ArrayList<>();  
	
	public ValidationError(Integer status, String msg, Long timestamp) {
		super(status, msg, timestamp);
	}

	public List<FieldMassage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String massage) {
		errors.add(new FieldMassage(fieldName, massage));
	}
}
