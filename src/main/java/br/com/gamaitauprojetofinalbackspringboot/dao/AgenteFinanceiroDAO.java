package br.com.gamaitauprojetofinalbackspringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.gamaitauprojetofinalbackspringboot.beans.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro, Integer>  {
	
	@Query(value= "SELECT ag.id_agente, ag.nome_agente, ag.volume_transacional, COUNT(id_transaction) AS TOTAL "
			+ "FROM mtb310_transaction tr "
			+ "JOIN mtb310_ag_financeiro ag ON ag.id_agente = tr.ag_financeiro_id_agente "
			+ "group by (ag_financeiro_id_agente) "
			+ "ORDER BY TOTAL DESC "
			+ "LIMIT 10;", nativeQuery=true)
	public List<AgenteFinanceiro> findTopTen();
	
	
}
