package com.gen.ProjetoIntegrador.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gen.ProjetoIntegrador.model.Projetos;

@Repository
public interface ProjetosRepository extends JpaRepository<Projetos, Long> {

	List<Projetos> findAllByNomeContainingIgnoreCase(@Param("nome_projeto")String nome_projeto);
	Optional<Projetos> findOneByNomeIgnoreCase(String nome);

}
