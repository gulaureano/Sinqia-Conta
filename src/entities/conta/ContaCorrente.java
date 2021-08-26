package entities.conta;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaCorrente extends Conta {
	static Double tarifasBancarias = 13.9;
	private Integer qtdMaximaSaque;
	private Integer qtdMaximaTransferencia;
	private int qtdSaque;
	private int qtdTransferencia;

	public ContaCorrente(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, LocalDate dataAbertura, Cliente cliente, Integer qtdMaximaSaque,
			Integer qtdMaximaTransferencia) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
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

	@Override
	public void saque(double saque) {
		if (qtdSaque < qtdMaximaSaque) {
			super.saque(saque);
			qtdSaque++;
		} else {
			super.saque(saque + 5.0);
			System.out.println(
					"Devido a quantidade máxima de saque ter sido excedida, foi descontado um valor de R$5,00");
		}
	}

	@Override
	public void transferencia(Conta conta, Double valor) {
		if (qtdTransferencia >= getQtdMaximaTransferencia()) {
			System.out.println("Você atingiu a quantidade máxima de saques permitida");
		} else {
			super.transferencia(conta, valor);
			qtdTransferencia++;
		}

	}

	// MÉTODO QUE COBRA A TARIFA MENSAL TODO DIA 05, DESCONTANDO O VALOR DA
	// CONSTANTE "tarifasBancarias", IRÁ PEGAR A DATA DE HOJE
	public void tarifaBancaria() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int diaTarifa = 26;

		if (cal.get(Calendar.DAY_OF_MONTH) == diaTarifa) {
			System.out.printf("Seu saldo era de %.2f\n", getSaldo());
			this.saldo -= tarifasBancarias;
			System.out.printf("Foi cobrado o valor de 13,90 do seu saldo, e agora seu saldo é: %.2f\n", getSaldo());
		} else {
			System.out.println("Ainda não é o dia para cobrar sua tarifa");
		}
	}

}
