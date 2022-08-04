package com.gen.ProjetoIntegrador.repository;

import java.util.List;

import com.gen.ProjetoIntegrador.model.Projetos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProjetosRepository extends JpaRepository<Projetos, Long> {
	public List<Projetos>findAlByNomeContainingIgnoreCase(@Param("nome_projeto")String nome_projeto);

}
