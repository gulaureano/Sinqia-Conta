package entities.conta;

import java.time.LocalDate;

import entities.cliente.Cliente;

public class ContaEmpresarial extends Conta {
	
	private String nomeEmpresa;
	
	public ContaEmpresarial(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta,
			Integer numeroAgencia, Double saldo, LocalDate dataAbertura, Cliente cliente, String nomeEmpresa) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}



	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}



	// MÉTODO PARA SAQUE SIMPLES
	@Override
	public void saque(double saque) {
		if (((getSaldo() - saque) >= 0)) {
			this.saldo -= saque;
		} else {
			System.out.println("Seu saldo é insulficiente para esta operação");
		}

	}

	// MÉTODO PARA DEPÓSITO SIMPLES
	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	
	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Nome da Empresa: " + getNomeEmpresa() + "\n");
		return sb.toString();
	}
		
}
