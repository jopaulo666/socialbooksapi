package com.jopaulo.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 156397782302059331L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
