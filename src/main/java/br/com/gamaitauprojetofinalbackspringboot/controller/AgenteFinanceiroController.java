package br.com.gamaitauprojetofinalbackspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamaitauprojetofinalbackspringboot.beans.AgenteFinanceiro;
import br.com.gamaitauprojetofinalbackspringboot.dao.AgenteFinanceiroDAO;

@RestController
@CrossOrigin("*")
public class AgenteFinanceiroController {
		
		@Autowired
		private AgenteFinanceiroDAO dao;
		
		@GetMapping("/agentes")
		public ResponseEntity<List<AgenteFinanceiro>> findAll(){
			List<AgenteFinanceiro> lista = (List<AgenteFinanceiro>)dao.findAll();
			if(lista.size() == 0) {
				return ResponseEntity.status(404).build();
			}
			return ResponseEntity.ok(lista);
		}
		
		@GetMapping("/topagentes")
		public ResponseEntity<List<AgenteFinanceiro>> findTopTen(){
			List<AgenteFinanceiro> lista = (List<AgenteFinanceiro>)dao.findTopTen();
			if(lista.size() == 0) {
				return ResponseEntity.status(404).build();
			}
			return ResponseEntity.ok(lista);
		}
}
