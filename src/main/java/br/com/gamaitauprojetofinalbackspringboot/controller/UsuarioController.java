package br.com.gamaitauprojetofinalbackspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamaitauprojetofinalbackspringboot.beans.Usuario;
import br.com.gamaitauprojetofinalbackspringboot.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if(resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll() {
		List<Usuario> lista = (List<Usuario>)dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
}
