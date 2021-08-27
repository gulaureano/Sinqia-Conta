package entities.conta;

import java.time.LocalDate;

import entities.cliente.Cliente;

public abstract class Conta {

	private String nomeBanco;
	private String codigoIdentificadorBanco;
	protected String numeroConta;
	protected String numeroAgencia;
	protected Double saldo;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String motivoFechamento;

	private Cliente cliente;
	
	

	public Conta(String nomeBanco, String codigoIdentificadorBanco, String numeroConta, String numeroAgencia,
			Double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento, Cliente cliente) {
		super();
		this.nomeBanco = nomeBanco;
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.motivoFechamento = motivoFechamento;
		this.cliente = cliente;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}



	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}



	public String getCodigoIdentificadorBanco() {
		return codigoIdentificadorBanco;
	}



	public void setCodigoIdentificadorBanco(String codigoIdentificadorBanco) {
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
	}



	public String getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}



	public String getNumeroAgencia() {
		return numeroAgencia;
	}



	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public LocalDate getDataAbertura() {
		return dataAbertura;
	}



	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}



	public LocalDate getDataFechamento() {
		return dataFechamento;
	}



	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}



	public String getMotivoFechamento() {
		return motivoFechamento;
	}



	public void setMotivoFechamento(String motivoFechamento) {
		this.motivoFechamento = motivoFechamento;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public void saque(double saque) {
		if (saque <= this.saldo) {
			this.saldo -= saque;
		} else {
			System.out.println("saldo insulficiente");
		}
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferencia(Conta conta, Double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			conta.deposito(valor);
		} else {
			System.out.println("Você está tentando transferir um valor maior que você possui no saldo");
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(cliente.toString());
		sb.append("Nome do Banco: " + nomeBanco + "\n");
		sb.append("Código Identificador: " + codigoIdentificadorBanco + "\n");
		sb.append("Número da Conta: " + numeroConta + "\n");
		sb.append("Número da Âgencia: " + numeroAgencia + "\n");
		sb.append("Saldo Atual: " + String.format("%.2f", saldo) + "\n");
		sb.append("Data de Abertura: " + dataAbertura + "\n");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroAgencia == null) ? 0 : numeroAgencia.hashCode());
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			System.out.println("As contas são iguais");
			return true;
		}
		if (obj == null){
			System.out.println("As contas são diferentes");
			return false;
		}
		if (getClass() != obj.getClass()){
			System.out.println("As contas são diferentes");
			return false;
		}
		Conta other = (Conta) obj;
		if (numeroAgencia == null) {
			if (other.numeroAgencia != null){
				System.out.println("As contas são diferentes");
				return false;
			}
		} else if (!numeroAgencia.equals(other.numeroAgencia)){
			System.out.println("As contas são diferentes");
			return false;
		}
		if (numeroConta == null) {
			if (other.numeroConta != null){
				System.out.println("As contas são diferentes");
				return false;
			}
		} else if (!numeroConta.equals(other.numeroConta)){
			System.out.println("As contas são diferentes");
			return false;
		}
		System.out.println("As contas são iguais");
		return true;
	}
	
	
}
