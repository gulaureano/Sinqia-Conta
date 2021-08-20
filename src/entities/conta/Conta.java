package entities.conta;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.cliente.Cliente;

public abstract class Conta {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String nomeBanco;
	private Integer codigoIdentificadorBanco;
	private Integer numeroConta;
	private Integer numeroAgencia;
	private Double saldo;
	private Date dataAbertura;
	private Date dataFechamento;
	private String motivoFechamento;
	private Integer qtdTransferencia = 0;
	
	private Cliente cliente;

	// APAGAR MÉTODO APÓS TESTE NA CLASSE CONTA CORRENTE
	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	// APAGAR MÉTODO APÓS TESTES NA CLASSE CONTA POUPANÇA
	public Conta(Double saldo, Date aberturaConta) {
		this.saldo = saldo;
		this.dataAbertura = aberturaConta;
	}

	public Conta(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, Date dataAbertura,	Cliente cliente) {
		super();
		this.nomeBanco = nomeBanco;
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.cliente = cliente;
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
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
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

	public Integer getQtdTransferencia() {
		return qtdTransferencia;
	}

	public void setQtdTransferencia(Integer qtdTransferencia) {
		this.qtdTransferencia = qtdTransferencia;
	}

	// MÉTODO ABSTRATO DE SAQUE
	public abstract void saque(double saque);

	// MÉTODO ABSTRATO DE DEPOSITO
	public abstract void deposito(double deposito);

	// MÉTODO DE TRANSFERENCIA
	public void transferencia(Conta conta, double valor) {
		if (saldo > 0) {
			saldo -= valor;

			conta.deposito(valor);
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(cliente.toString());
		sb.append("Nome do Banco: " + getNomeBanco() + "\n");
		sb.append("Código Identificador: " + getCodigoIdentificadorBanco() + "\n");
		sb.append("Número da Conta: " + getNumeroConta() + "\n");
		sb.append("Número da Âgencia: " + getNumeroAgencia() + "\n");
		sb.append("Saldo Atual: " + String.format("%.2f", getSaldo()) + "\n");
		sb.append("Data de Abertura: " + sdf.format(getDataAbertura()) + "\n");
		return sb.toString();
	}

	public void transferencia(Conta conta, Double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			conta.deposito(valor);
		} else {
			System.out.println("Você está tentando sacar um valor maior que você possui no saldo");
		}
	}

	
	/*this.nomeBanco = nomeBanco;
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.cliente = cliente;*/
}
