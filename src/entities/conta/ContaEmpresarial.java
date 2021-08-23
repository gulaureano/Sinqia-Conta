package entities.conta;

import java.util.Date;

import entities.cliente.Cliente;

public class ContaEmpresarial extends Conta {
	public ContaEmpresarial(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta,
			Integer numeroAgencia, Double saldo, Date dataAbertura, Cliente cliente) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
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

	@Override
	public void transferencia(Conta conta, double valor) {
		if (getSaldo() >= valor) {
			this.saldo -= valor;
			conta.deposito(valor);
		} else {
			System.out.println("Você está tentando sacar um valor maior que você possui no saldo");
		}
	}
}
