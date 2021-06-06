package com.projeto.zup.controle.dominio;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity 
@Table(name = "VEICULOS")
public class Veiculo extends EntidadeAbstrata <Long>{
	
	@Column(name = "veiculo", nullable = false)
	private String nome;
	
	@ManyToOne
	private List<Veiculo> veiculo;

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	public String getNome() { 
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
