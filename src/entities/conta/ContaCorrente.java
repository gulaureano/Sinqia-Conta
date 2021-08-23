package entities.conta;

import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaCorrente extends Conta {
	final Double tarifasBancarias = 13.9;
	private Integer qtdSaque;

	public ContaCorrente(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, Date dataAbertura, Cliente cliente) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura,
				cliente);
	}

	public Integer getQtdSaque() {
		return qtdSaque;
	}

	public void setQtdSaque(Integer qtdSaque) {
		this.qtdSaque = qtdSaque;
	}

	// SOBRESCRITA DO MÉTODO SAQUE NA CLASSE CONTA CORRENTE
	@Override
	public void saque(double saque) {
		if (qtdSaque < 4) {
			if ((getSaldo() - saque) >= 0) {
				this.saldo -= saque;
				qtdSaque++;
			} else {
				System.out.println("Saldo insulficiente");
			}
		} else {
			System.out.println("Será feito o saque, porém com uma taxa adicional");
			if ((getSaldo() - saque) >= 0) {
				this.saldo -= saque - 4.0;
				System.out.println(getSaldo());
			} else {
				System.out.println("Saldo insulficiente");
			}
		}
	}

	// SOBRESCRITA DO MÉTODO DEPOSITO NA CLASSE CONTA CORRENTE
	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	// SOBRECRITA DO MÉTODO TRANSFERENCIA NA CLASSE CONTA CORRENTE
	@Override
	public void transferencia(Conta conta, double valor) {
		if (getQtdTransferencia() < 4) {
			if (getSaldo() >= valor) {
				this.saldo -= valor;
				conta.deposito(valor);
				this.qtdTransferencia += 1;
			} else {
				System.out.println("Você está tentando sacar um valor maior que você possui no saldo");
			}
		} else {
			System.out.println("Você chegou a um limite de saque esse mês");
		}
	}

	// MÉTODO QUE COBRA A TARIFA MENSAL TODO DIA 05, DESCONTANDO O VALOR DA
	// CONSTANTE "tarifasBancarias", IRÁ PEGAR A DATA DE HOJE
	public void tarifaBancaria() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int diaTarifa = 5;
		int diaCobrança = cal.get(Calendar.DAY_OF_MONTH);

		if (diaCobrança == diaTarifa) {
			System.out.printf("Seu saldo era de %.2f\n", getSaldo());
			this.saldo -= tarifasBancarias;
			System.out.printf("Foi cobrado o valor de 13,90 do seu saldo, e agora seu saldo é: %.2f\n", getSaldo());
		} else {
			System.out.println("Ainda não é o dia para cobrar sua tarifa");
		}
	}
}
