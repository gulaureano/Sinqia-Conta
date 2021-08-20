package entities.cliente;

import java.util.ArrayList;
import java.util.List;

import entities.conta.Conta;

public class Cliente {
	
	private String nomeCliente;
	private Integer numeroDocumentoCliente;
	private Double scoreCliente;
	
	private List<Conta> conta = new ArrayList<>();

	public Cliente(String nomeCliente, Integer numeroDocumentoCliente, Double scoreCliente) {
		this.nomeCliente = nomeCliente;
		this.numeroDocumentoCliente = numeroDocumentoCliente;
		this.scoreCliente = scoreCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumeroDocumentoCliente() {
		return numeroDocumentoCliente;
	}

	public void setNumeroDocumentoCliente(Integer numeroDocumentoCliente) {
		this.numeroDocumentoCliente = numeroDocumentoCliente;
	}

	public Double getScoreCliente() {
		return scoreCliente;
	}

	public void setScoreCliente(Double scoreCliente) {
		this.scoreCliente = scoreCliente;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Cliente: " + nomeCliente + "\n");
		sb.append("CPF/CNPJ: " + numeroDocumentoCliente + "\n");
		sb.append("Score do Cliente: " + String.format("%.2f", scoreCliente) + "\n");
		return sb.toString();
		
	}
}
