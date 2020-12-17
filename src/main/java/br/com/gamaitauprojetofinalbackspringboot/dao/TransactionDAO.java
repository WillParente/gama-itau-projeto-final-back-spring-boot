package br.com.gamaitauprojetofinalbackspringboot.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.gamaitauprojetofinalbackspringboot.beans.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer>{

	@Query(value= "SELECT COUNT(id_transaction) AS TOTAL FROM mtb310_transaction WHERE ag_financeiro_id_agente = :num", nativeQuery=true)
	public int findByTotalTransactons(@Param("num") int num);
	
	@Query(value= "SELECT COUNT(id_transaction) AS TOTAL FROM mtb310_transaction WHERE ag_financeiro_id_agente = :num AND ", nativeQuery=true)
	public int findByTotalSucesso(@Param("num") int num);
	
	@Query(value= "SELECT COUNT(id_transaction) AS TOTAL FROM mtb310_transaction WHERE ag_financeiro_id_agente = :num", nativeQuery=true)
	public int findByTotalFalhas(@Param("num") int num);
	
	@Query(value= "SELECT COUNT(id_transaction) AS TOTAL FROM mtb310_transaction WHERE ag_financeiro_id_agente = :num", nativeQuery=true)
	public int findByTotalFraudes(@Param("num") int num);
}
