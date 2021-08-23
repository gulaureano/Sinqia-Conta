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

	// SOBRESCRITA DO M�TODO SAQUE NA CLASSE CONTA CORRENTE
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
			System.out.println("Ser� feito o saque, por�m com uma taxa adicional");
			if ((getSaldo() - saque) >= 0) {
				this.saldo -= saque - 4.0;
				System.out.println(getSaldo());
			} else {
				System.out.println("Saldo insulficiente");
			}
		}
	}

	// SOBRESCRITA DO M�TODO DEPOSITO NA CLASSE CONTA CORRENTE
	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	// SOBRECRITA DO M�TODO TRANSFERENCIA NA CLASSE CONTA CORRENTE
	@Override
	public void transferencia(Conta conta, double valor) {
		if (getQtdTransferencia() < 4) {
			if (getSaldo() >= valor) {
				this.saldo -= valor;
				conta.deposito(valor);
				this.qtdTransferencia += 1;
			} else {
				System.out.println("Voc� est� tentando sacar um valor maior que voc� possui no saldo");
			}
		} else {
			System.out.println("Voc� chegou a um limite de saque esse m�s");
		}
	}

	// M�TODO QUE COBRA A TARIFA MENSAL TODO DIA 05, DESCONTANDO O VALOR DA
	// CONSTANTE "tarifasBancarias", IR� PEGAR A DATA DE HOJE
	public void tarifaBancaria() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int diaTarifa = 5;
		int diaCobran�a = cal.get(Calendar.DAY_OF_MONTH);

		if (diaCobran�a == diaTarifa) {
			System.out.printf("Seu saldo era de %.2f\n", getSaldo());
			this.saldo -= tarifasBancarias;
			System.out.printf("Foi cobrado o valor de 13,90 do seu saldo, e agora seu saldo �: %.2f\n", getSaldo());
		} else {
			System.out.println("Ainda n�o � o dia para cobrar sua tarifa");
		}
	}
}
