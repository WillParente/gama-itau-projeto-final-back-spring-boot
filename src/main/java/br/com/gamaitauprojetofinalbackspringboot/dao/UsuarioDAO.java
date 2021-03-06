package br.com.gamaitauprojetofinalbackspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gamaitauprojetofinalbackspringboot.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
		
	public Usuario findByEmailAndSenha(String email, String senha);
	
	public Usuario findByRacfAndSenha(String email, String senha);
}
