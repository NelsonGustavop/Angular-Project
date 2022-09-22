package com.Slayer.Angular.resource.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String Message;

	public FieldMessage() {
		super();

	}

	public FieldMessage(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		Message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

}
