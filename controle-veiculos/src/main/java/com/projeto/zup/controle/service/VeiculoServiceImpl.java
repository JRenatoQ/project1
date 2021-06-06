package com.projeto.zup.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.zup.controle.dao.VeiculoDao;
import com.projeto.zup.controle.dominio.Veiculo;

@Service @Transactional(readOnly = false)
public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	private VeiculoDao dao;
	
	@Override
	public void salvar(Veiculo veiculo) {
		dao.save(veiculo);
	}

	@Override
	public void editar(Veiculo veiculo) {
		dao.update(veiculo);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Veiculo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Veiculo> buscarTodos() {
		
		return dao.findAll();
	}
}
