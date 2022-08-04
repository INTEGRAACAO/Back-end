package com.gen.ProjetoIntegrador.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotNull
  @Size(min = 3, max = 125)
  private String nome;
  private String email;
  private String apelido;
  private String senha;
  private String link_foto;
  private String bio;
  private String tipo_acesso;
  @NotNull
  private Date data_nascimento;
  @UpdateTimestamp
  private LocalDateTime data_cadastro;

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

  public String getLink_foto() {
    return link_foto;
  }

  public void setLink_foto(String link_foto) {
    this.link_foto = link_foto;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getTipo_acesso() {
    return tipo_acesso;
  }

  public void setTipo_acesso(String tipo_acesso) {
    this.tipo_acesso = tipo_acesso;
  }

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public LocalDateTime getData_cadastro() {
    return data_cadastro;
  }

  public void setData_cadastro(LocalDateTime data_cadastro) {
    this.data_cadastro = data_cadastro;
  }
}