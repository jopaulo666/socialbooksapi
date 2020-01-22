package com.jopaulo.socialbooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jopaulo.socialbooks.domain.Autor;
import com.jopaulo.socialbooks.repository.AutoresRepository;
import com.jopaulo.socialbooks.services.exceptions.AutorExistenteException;
import com.jopaulo.socialbooks.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;

	public List<Autor> listar() {
		return autoresRepository.findAll();
	}

	public Autor salvar(Autor autor) {
		if (autor.getId() != null) {
			Autor a = autoresRepository.findById(autor.getId()).orElse(null);

			if (a != null) {
				throw new AutorExistenteException("Autor já cadastrado");
			}
		}
		return autoresRepository.save(autor);
	}
	
	public Autor buscar(Long id) {
		Autor autor = autoresRepository.findById(id).orElse(null);
		
		if (autor == null) {
			throw new AutorNaoEncontradoException("Autor não encontrado");
		}
		return autor;
	}
}
