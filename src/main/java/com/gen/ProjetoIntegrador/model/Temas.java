package com.gen.ProjetoIntegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "temas")
public class Temas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@NotBlank
	@Size(min = 1, max = 2000)
	private String temas;
	
	@OneToMany (mappedBy = "temas", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("temas")
	private List<Projetos> projetos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTemas() {
		return temas;
	}

	public void setTemas(String temas) {
		this.temas = temas;
	}

	public List<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjeto(List<Projetos> projetos) {
		this.projetos = projetos;
	}

	
}
