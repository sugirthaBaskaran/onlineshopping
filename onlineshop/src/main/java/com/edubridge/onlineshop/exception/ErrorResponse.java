package com.edubridge.onlineshop.exception;

import java.util.Objects;

public class ErrorResponse {

	public String message;
	private int status;
	
	public ErrorResponse() { 
		
		
	}
	

	public ErrorResponse(String message, int status) {
		super();
		this.message = message;
		this.status = status;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorResponse other = (ErrorResponse) obj;
		return Objects.equals(message, other.message) && status == other.status;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", status=" + status + "]";
	}
	
}
