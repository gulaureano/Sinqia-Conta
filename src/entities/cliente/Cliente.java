package entities.cliente;

import entities.enums.TipoCliente;

public class Cliente {
	
	private String nomeCliente;
	private Integer numeroDocumentoCliente;
	private Double scoreCliente;
	private TipoCliente tipoCliente;

	public Cliente(String nomeCliente, Integer numeroDocumentoCliente, Double scoreCliente, TipoCliente tipoCliente) {
		this.nomeCliente = nomeCliente;
		this.numeroDocumentoCliente = numeroDocumentoCliente;
		this.scoreCliente = scoreCliente;
		this.tipoCliente = tipoCliente;
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
	
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Cliente: " + nomeCliente + "\n");
		sb.append("CPF/CNPJ: " + numeroDocumentoCliente + "\n");
		sb.append("Score do Cliente: " + String.format("%.2f", scoreCliente) + "\n");
		sb.append("Tipo do Cliente: " + getTipoCliente() + "\n");
		return sb.toString();
		
	}
}
