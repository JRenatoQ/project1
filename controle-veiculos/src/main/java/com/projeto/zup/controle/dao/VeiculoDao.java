package com.projeto.zup.controle.dao;

import java.util.List;

import com.projeto.zup.controle.dominio.Veiculo;

public interface VeiculoDao {

	void save(Veiculo veiculo);
	
	void update(Veiculo veiculo);
	
	void delete(Long id);
	
	Veiculo findById(Long id);
	
	List<Veiculo> findAll();
}
