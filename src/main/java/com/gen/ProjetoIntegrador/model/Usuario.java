package com.gen.ProjetoIntegrador.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 125, message = "O nome deve conter no mínimo 2 e no máximo 125 caracteres")
	private String nome;
	
	@Schema(example = "email@email.com.br")
	@Email
	private String email;
	
	@NotNull(message = "O atributo Usuário é Obrigatório!")
	@Size(min = 2, max = 125, message = "O nickname deve conter no mínimo 2 e no máximo 125 caracteres")
	private String apelido;

	@NotNull
	@Size(min = 8, max = 128, message = "A senha deve conter no mínimo 8 caracteres")
	private String senha;

	@Size(max = 500)
	private String linkFoto;

	@Size(min = 1, max = 2000, message = "A biografia deve conter no mínimo 1 e no máximo 255 caracteres")
	private String bio;

	@NotNull
	private String tipoAcesso;

	@NotNull
	private LocalDate dataNascimento;

	@UpdateTimestamp
	private LocalDateTime dataCadastro;
	
	@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Projetos> projetos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projetos> projetos) {
		this.projetos = projetos;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}