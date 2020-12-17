package br.com.gamaitauprojetofinalbackspringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.gamaitauprojetofinalbackspringboot.beans.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro, Integer>  {
	
	@Query(value= "SELECT id_agente, nome_agente, volume_transacional "
			+ "FROM mtb310_ag_financeiro "
			+ "ORDER BY volume_transacional DESC "
			+ "LIMIT 10;", nativeQuery=true)
	public List<AgenteFinanceiro> findTopTen();
	
	
}
