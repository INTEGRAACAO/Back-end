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
@Table(name = "tb_comentario")
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comentarioID;
	
	@ManyToOne
	@JsonIgnoreProperties("Comentario")
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("Comentario")
	private Projetos projetos;
	
	@NotBlank
	@Size(min = 1, max = 2000)
	private String comentario;
	
	@UpdateTimestamp
	private LocalDateTime data_comentario;

	public Long getComentarioID() {
		return comentarioID;
	}

	public void setComentarioID(Long comentarioID) {
		this.comentarioID = comentarioID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Projetos getProjetos() {
		return projetos;
	}

	public void setProjetos(Projetos projetos) {
		this.projetos = projetos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public LocalDateTime getData_comentario() {
		return data_comentario;
	}

	public void setData_comentario(LocalDateTime data_comentario) {
		this.data_comentario = data_comentario;
	}
}
