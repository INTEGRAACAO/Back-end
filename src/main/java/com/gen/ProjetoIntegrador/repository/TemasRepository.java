package com.gen.ProjetoIntegrador.repository;

import java.util.List;

import com.gen.ProjetoIntegrador.model.Temas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TemasRepository extends JpaRepository<Temas, Long> {
	public List<Temas> findAllByTemasContainingIgnoreCase(@Param("temas")String temas);
}
