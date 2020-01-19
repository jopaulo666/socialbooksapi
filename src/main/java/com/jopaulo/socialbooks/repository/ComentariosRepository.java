package com.jopaulo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
