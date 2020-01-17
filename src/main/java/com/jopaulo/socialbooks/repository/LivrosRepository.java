package com.jopaulo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.socialbooks.domain.Livro;

//manipulação de dados

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
