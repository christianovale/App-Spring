package br.com.christiano.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Clientes implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Integer idade;
	private String profissao;
		
	public Clientes(String nome, Integer idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
	}
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
