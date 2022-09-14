package com.gen.ProjetoIntegrador.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "projetos")
public class Projetos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String apoios;
	
	@NotBlank
	@Size(min = 2, max = 100, message = "Deve conter no mínimo 2 caracteres e no máximo 100")
	private String nome;
	
	@Size(min = 1, max = 255)
	private String linkImagem;
	
	@Size(min = 1, max = 255, message = "Deve conter no mínimo 1 caracter e no máximo 255")
	private String descricao;
	
	@UpdateTimestamp
	private LocalDateTime dataProjeto;
	
	@ManyToOne
	@JsonIgnoreProperties("projetos")
	private Usuario usuario;
	
	@ManyToOne 
	@JsonIgnoreProperties("projetos")
	private Temas temas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApoios() {
		return apoios;
	}

	public void setApoios(String apoios) {
		this.apoios = apoios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkImagem() {
		return linkImagem;
	}

	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataProjeto() {
		return dataProjeto;
	}

	public void setDataProjeto(LocalDateTime dataProjeto) {
		this.dataProjeto = dataProjeto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Temas getTemas() {
		return temas;
	}

	public void setTemas(Temas temas) {
		this.temas = temas;
	}


}
