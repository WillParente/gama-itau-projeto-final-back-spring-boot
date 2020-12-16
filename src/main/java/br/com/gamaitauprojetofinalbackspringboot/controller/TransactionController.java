package br.com.gamaitauprojetofinalbackspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamaitauprojetofinalbackspringboot.beans.Transaction;
import br.com.gamaitauprojetofinalbackspringboot.dao.TransactionDAO;

@RestController
@CrossOrigin("*")
public class TransactionController {

		@Autowired
		private TransactionDAO dao;
		
		@GetMapping("/transactions")
		public ResponseEntity<List<Transaction>> findAll(){
			List<Transaction> lista = (List<Transaction>)dao.findAll();
			if(lista.size() == 0) {
				return ResponseEntity.status(404).build();
			}
			return ResponseEntity.ok(lista);
		}
}
