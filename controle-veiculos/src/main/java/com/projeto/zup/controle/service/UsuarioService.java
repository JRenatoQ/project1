package com.projeto.zup.controle.service;

import java.util.List;

import com.projeto.zup.controle.dominio.Usuario;

public interface UsuarioService {

	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario buscarPorId(Long id);
	
	List<Usuario> buscarTodos();
}
