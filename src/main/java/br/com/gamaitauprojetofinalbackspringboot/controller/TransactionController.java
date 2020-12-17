package br.com.gamaitauprojetofinalbackspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		@GetMapping("/totaltransactions/{agente}")
		public ResponseEntity<Integer> getTotalTransactons(@PathVariable int agente){
			return ResponseEntity.ok(dao.findByTotalTransactons(agente));
		}
		
		@GetMapping("/successtransactions/{agente}")
		public ResponseEntity<Integer> getSuccessTransactons(@PathVariable int agente){
			return ResponseEntity.ok(dao.findByTotalSucesso(agente));
		}
		
		@GetMapping("/failedtransactions/{agente}")
		public ResponseEntity<Integer> getFailedTransactons(@PathVariable int agente){
			return ResponseEntity.ok(dao.findByTotalFalhas(agente));
		}
		
		@GetMapping("/fraudtransactions/{agente}")
		public ResponseEntity<Integer> getFraudTransactons(@PathVariable int agente){
			return ResponseEntity.ok(dao.findByTotalFraudes(agente));
		}
}
