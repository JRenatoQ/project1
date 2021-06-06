package com.projeto.zup.controle.service;

import java.util.List;

import com.projeto.zup.controle.dominio.Veiculo;

public interface VeiculoService {
	
	void salvar(Veiculo veiculo);
	
	void editar(Veiculo veiculo);
	
	void excluir(Long id);
	
	Veiculo buscarPorId(Long id);
	
	List<Veiculo> buscarTodos();
}
