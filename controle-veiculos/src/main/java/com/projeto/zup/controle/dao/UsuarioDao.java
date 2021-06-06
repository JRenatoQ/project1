package com.projeto.zup.controle.dao;

import java.util.List;

import com.projeto.zup.controle.dominio.Usuario;

public interface UsuarioDao {

	void save(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(Long id);
	
	Usuario findById(Long id);
	
	List<Usuario> findAll();
}
