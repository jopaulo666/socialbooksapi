package com.jopaulo.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jopaulo.socialbooks.domain.DetalhesErros;
import com.jopaulo.socialbooks.services.exceptions.LivroNaoEncontradoException;

/**
 * Manipulador de exceções
 */

@ControllerAdvice //intercepta todos os tipos de exceções no código
public class ResourceExceptionHandler {

	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<DetalhesErros> handleLivroNaoEncontradoException(LivroNaoEncontradoException e, HttpServletRequest request){
		
		DetalhesErros erros = new DetalhesErros();
		erros.setStatus(404l);
		erros.setTitulo("Livro não encontrado");
		erros.setMsgDesenvoledor("http://erros.socialbooks.com/404");
		erros.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erros);
	}
}
