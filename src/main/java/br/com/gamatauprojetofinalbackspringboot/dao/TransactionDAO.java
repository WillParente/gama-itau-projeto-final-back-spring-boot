package br.com.gamatauprojetofinalbackspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gamatauprojetofinalbackspringboot.beans.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer>{

}
