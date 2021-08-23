package entities.conta;


import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaPoupanca extends Conta {

	private Double valorizacaoMensal;

	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();

	public ContaPoupanca(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, Date dataAbertura, Cliente cliente) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura,	cliente);
	}

	public Double getValorizacaoMensal() {
		return valorizacaoMensal;
	}

	public void setValorizacaoMensal(Double valorizacaoMensal) {
		this.valorizacaoMensal = valorizacaoMensal;
	}

	// MÉTODO PARA ACRESCENTAR UMA PORCENTAGEM AO SALDO TODO MÊS, IRÁ PEGAR A
	// DATA DE HOJE
	public void valorizacaoMensal() {
		Calendar cal = Calendar.getInstance();
		double porcentagem = 0.5;
		double resultado = 0.0;
		cal.setTime(new Date());
		int diaValorizacao = 20;
		int hoje = cal.get(Calendar.DAY_OF_MONTH);

		if (diaValorizacao == hoje) {
			System.out.printf("Seu saldo é: %.2f\n", getSaldo());
			resultado = getSaldo() * porcentagem;
			this.saldo += resultado;
			System.out.printf("Agora seu saldo devido a valorização é: %.2f\n", getSaldo());
		} else {
			System.out.println("Não ocorreu juros no seu saldo");
		}
	}

	@Override
	public void saque(double saque) {
		long diaAbertura = getDataAbertura().getTime();
		long hoje = new Date().getTime();
		long resultado = (hoje - diaAbertura) / 86400000L;

		if (resultado >= 29) {
			if (!((getSaldo() - saque) < 0)) {
				this.saldo -= saque;
			} else {
				System.out.println("Seu saldo é insulficiente para esta operação");
			}
		} else {
			System.out.println("O tempo para saque ainda não ultrapassou 30 dias");
		}
	}

	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
}