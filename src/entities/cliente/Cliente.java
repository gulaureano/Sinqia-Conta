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

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Cliente: " + nomeCliente + "\n");
		sb.append("CPF/CNPJ: " + numeroDocumentoCliente + "\n");
		sb.append("Score do Cliente: " + String.format("%.2f", scoreCliente) + "\n");
		sb.append("Tipo do Cliente: " + getTipoCliente() + "\n");
		return sb.toString();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDocumentoCliente == null) ? 0 : numeroDocumentoCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Os clientes são iguais");
			return true;
		}
		if (obj == null) {
			System.out.println("Os clientes são diferentes");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("Os clientes são diferentes");
			return false;
		}
		Cliente other = (Cliente) obj;
		if (numeroDocumentoCliente == null) {
			if (other.numeroDocumentoCliente != null) {
				System.out.println("Os clientes são diferentes");
				return false;
			}
		} else if (!numeroDocumentoCliente.equals(other.numeroDocumentoCliente)) {
			System.out.println("Os clientes são diferentes");
			return false;
		}
		System.out.println("Os clientes são iguais");
		return true;

	}

	
}
