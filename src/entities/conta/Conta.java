package entities.conta;

import java.time.LocalDate;

import entities.cliente.Cliente;

public abstract class Conta {

	private String nomeBanco;
	private Integer codigoIdentificadorBanco;
	private Integer numeroConta;
	private Integer numeroAgencia;
	protected Double saldo;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String motivoFechamento;

	private Cliente cliente;

	public Conta(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, LocalDate dataAbertura, Cliente cliente) {
		this.nomeBanco = nomeBanco;
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.cliente = cliente;
	}

	public Conta() {

	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getCodigoIdentificadorBanco() {
		return codigoIdentificadorBanco;
	}

	public void setCodigoIdentificadorBanco(Integer codigoIdentificadorBanco) {
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
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

	// MÉTODO ABSTRATO DE SAQUE
	public abstract void saque(double saque);

	// MÉTODO ABSTRATO DE DEPOSITO
	public abstract void deposito(double deposito);

	public void transferencia(Conta conta, Double valor) {
		if (getSaldo() >= valor) {
			this.saldo -= valor;
			conta.deposito(valor);
		} else {
			System.out.println("Você está tentando sacar um valor maior que você possui no saldo");
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(cliente.toString());
		sb.append("Nome do Banco: " + getNomeBanco() + "\n");
		sb.append("Código Identificador: " + getCodigoIdentificadorBanco() + "\n");
		sb.append("Número da Conta: " + getNumeroConta() + "\n");
		sb.append("Número da Âgencia: " + getNumeroAgencia() + "\n");
		sb.append("Saldo Atual: " + String.format("%.2f", getSaldo()) + "\n");
		sb.append("Data de Abertura: " + getDataAbertura() + "\n");
		return sb.toString();
	}

	// MÉTODOS DO EXERCÍCIO 3

}
