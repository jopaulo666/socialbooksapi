package com.jopaulo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.socialbooks.domain.Autor;



/**
 * manipulação de dados
 */
public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
