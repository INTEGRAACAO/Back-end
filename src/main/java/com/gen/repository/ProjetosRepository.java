package com.gen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.gen.model.Projetos;

public interface ProjetosRepository extends JpaRepository<Projetos, Long> {
	public List<Projetos>findAlByNomeContainingIgnoreCase(@Param("nome_projeto")String nome_projeto);

}
