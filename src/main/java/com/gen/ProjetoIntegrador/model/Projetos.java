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
	private long id;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String apoios;
	
	private String nome_projeto;
	
	private String link_imagem;
	
	private String descricao;
	
	@UpdateTimestamp
	private LocalDateTime data_projeto;
	
	@ManyToOne
	@JsonIgnoreProperties("Projetos")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApoios() {
		return apoios;
	}

	public void setApoios(String apoios) {
		this.apoios = apoios;
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getLink_imagem() {
		return link_imagem;
	}

	public void setLink_imagem(String link_imagem) {
		this.link_imagem = link_imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData_projeto() {
		return data_projeto;
	}

	public void setData_projeto(LocalDateTime data_projeto) {
		this.data_projeto = data_projeto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
