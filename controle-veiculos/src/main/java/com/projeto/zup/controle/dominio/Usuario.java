package com.projeto.zup.controle.dominio;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIOS")
public class Usuario extends EntidadeAbstrata <Long> {

	@Column(name = "nome", nullable = false, unique = true)
	private String nome;
	
	@OneToMany(mappedBy = "veiculos")
	@JoinColumn(name = "id_veiculo_fk")
	private Veiculo veiculo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
