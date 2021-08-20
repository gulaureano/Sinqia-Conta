package entities.conta;

import java.util.Date;

import entities.cliente.Cliente;

public class ContaEmpresarial extends Conta {
	public ContaEmpresarial(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta,
			Integer numeroAgencia, Double saldo, Date dataAbertura, Cliente cliente) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
	}

	// M�TODO PARA SAQUE SIMPLES
	@Override
	public void saque(double saque) {
		if (((getSaldo() - saque) >= 0)) {
			setSaldo(getSaldo() - saque);
		} else {
			System.out.println("Seu saldo � insulficiente para esta opera��o");
		}

	}

	// M�TODO PARA DEP�SITO SIMPLES
	@Override
	public void deposito(double deposito) {
		setSaldo(getSaldo() + deposito);
	}

	@Override
	public void transferencia(Conta conta, double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			conta.deposito(valor);
		} else {
			System.out.println("Voc� est� tentando sacar um valor maior que voc� possui no saldo");
		}
	}
}
