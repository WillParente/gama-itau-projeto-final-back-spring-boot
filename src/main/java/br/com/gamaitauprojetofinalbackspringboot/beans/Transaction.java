package br.com.gamaitauprojetofinalbackspringboot.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_transaction")

public class Transaction {
			
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transaction")
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_hora")
	private Date data_hora;
	
	@Column(name="dispositivo")
	private int dispositivo;
	
	@Column(name="valor_solic")
	private float valor_solic;
	
	@Column(name="valor_aut")
	private float valor_aut;
	
	@Column(name="status")
	private int status;
	
	@JsonIgnoreProperties("transactions")
	@ManyToOne
	private AgenteFinanceiro ag_financeiro;

	public Transaction(int id, Date data_hora, int dispositivo, float valor_solic, float valor_aut, int status,
			AgenteFinanceiro ag_financeiro) {
		super();
		this.id = id;
		this.data_hora = data_hora;
		this.dispositivo = dispositivo;
		this.valor_solic = valor_solic;
		this.valor_aut = valor_aut;
		this.status = status;
		this.ag_financeiro = ag_financeiro;
	}

	public Transaction() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}

	public int getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}

	public float getValor_solic() {
		return valor_solic;
	}

	public void setValor_solic(float valor_solic) {
		this.valor_solic = valor_solic;
	}

	public float getValor_aut() {
		return valor_aut;
	}

	public void setValor_aut(float valor_aut) {
		this.valor_aut = valor_aut;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AgenteFinanceiro getAg_financeiro() {
		return ag_financeiro;
	}

	public void setAg_financeiro(AgenteFinanceiro ag_financeiro) {
		this.ag_financeiro = ag_financeiro;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", data_hora=" + data_hora + ", dispositivo=" + dispositivo + ", valor_solic="
				+ valor_solic + ", valor_aut=" + valor_aut + ", status=" + status + ", ag_financeiro=" + ag_financeiro
				+ "]";
	}
	
}