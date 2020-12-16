package br.com.gamatauprojetofinalbackspringboot.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_ag_financeiro")

public class AgenteFinanceiro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agente")
	private int id;
	
	@Column(name="nome_agente", length=100)
	private String nome_agente;
	
	@Column(name="volume_transacional")
	private float valor_solic;
	
	@OneToMany(mappedBy="ag_financeiro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("ag_financeiro")
	private List<Transaction> transactions;

	public AgenteFinanceiro(int id, String nome_agente, float valor_solic, List<Transaction> transactions) {
		super();
		this.id = id;
		this.nome_agente = nome_agente;
		this.valor_solic = valor_solic;
		this.transactions = transactions;
	}

	public AgenteFinanceiro() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_agente() {
		return nome_agente;
	}

	public void setNome_agente(String nome_agente) {
		this.nome_agente = nome_agente;
	}

	public float getValor_solic() {
		return valor_solic;
	}

	public void setValor_solic(float valor_solic) {
		this.valor_solic = valor_solic;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "AgenteFinanceiro [id=" + id + ", nome_agente=" + nome_agente + ", valor_solic=" + valor_solic
				+ ", transactions=" + transactions + "]";
	}
}