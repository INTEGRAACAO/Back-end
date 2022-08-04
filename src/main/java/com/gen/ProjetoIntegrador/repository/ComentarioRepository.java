package com.gen.ProjetoIntegrador.repository;

import java.util.List;

import com.gen.ProjetoIntegrador.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
	public List<Comentario> findAllByComentarioContainingIgnoreCase(@Param("comentario")String comentario);
}
