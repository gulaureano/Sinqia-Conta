package entities.conta;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaCorrente extends Conta {
	static Double tarifasBancarias = 13.9;
	private Integer qtdMaximaSaque;
	private Integer qtdMaximaTransferencia;
	private int qtdSaque = 0;
	private int qtdTransferencia = 0;

	public ContaCorrente(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, LocalDate dataAbertura, Cliente cliente, Integer qtdMaximaSaque, Integer qtdMaximaTransferencia) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura,
				cliente);
		this.qtdMaximaSaque = qtdMaximaSaque;
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public Integer getQtdMaximaTransferencia() {
		return qtdMaximaTransferencia;
	}

	public void setQtdMaximaTransferencia(Integer qtdMaximaTransferencia) {
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public Integer getQtdMaximaSaque() {
		return qtdMaximaSaque;
	}

	public void setQtdSaque(Integer qtdMaximaSaque) {
		this.qtdMaximaSaque = qtdMaximaSaque;
	}

	// SOBRESCRITA DO M�TODO SAQUE NA CLASSE CONTA CORRENTE
	@Override
	public void saque(double saque) {
		if (qtdSaque <= getQtdMaximaSaque()) {
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
				qtdSaque++;
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

	
	public void transferenciaContaCorrente(Conta conta, double valor) {
		if (qtdTransferencia >= getQtdMaximaTransferencia()){
			System.out.println("Voc� atingiu a quantidade m�xima de saques permitida");
		}
		else {
			super.transferencia(conta, valor);
			qtdTransferencia++;
		}
		
	}

	// M�TODO QUE COBRA A TARIFA MENSAL TODO DIA 05, DESCONTANDO O VALOR DA
	// CONSTANTE "tarifasBancarias", IR� PEGAR A DATA DE HOJE
	public void tarifaBancaria() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int diaTarifa = 5;
		
		if (cal.get(Calendar.DAY_OF_MONTH) == diaTarifa) {
			System.out.printf("Seu saldo era de %.2f\n", getSaldo());
			this.saldo -= tarifasBancarias;
			System.out.printf("Foi cobrado o valor de 13,90 do seu saldo, e agora seu saldo �: %.2f\n", getSaldo());
		} else {
			System.out.println("Ainda n�o � o dia para cobrar sua tarifa");
		}
	}
}
