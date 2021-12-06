package com.dhbtecnologia.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Ressource not found. Id" + id);
	}

}
