package com.jopaulo.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jopaulo.socialbooks.domain.Livro;

@RestController
public class LivrosResources {
	
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro l1 = new Livro("Java Avançado");
		Livro l2 = new Livro("Softblue");
		Livro l3 = new Livro("Algaworks");
		
		Livro[] livros = {l1,l2,l3};
		
		return Arrays.asList(livros);
	}
}
