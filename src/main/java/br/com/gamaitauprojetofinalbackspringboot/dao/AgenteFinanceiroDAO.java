package br.com.gamaitauprojetofinalbackspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gamaitauprojetofinalbackspringboot.beans.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro, Integer>  {

}
