package br.com.gamaitauprojetofinalbackspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gamaitauprojetofinalbackspringboot.beans.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer>{

}
