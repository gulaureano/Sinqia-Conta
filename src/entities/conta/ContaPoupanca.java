package entities.conta;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaPoupanca extends Conta {

	private Double valorizacaoMensal;
	private Integer mesesCarencia;
	private Integer qtdMaximaTransferencia;

	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();

	

	public ContaPoupanca(String nomeBanco, String codigoIdentificadorBanco, String numeroConta, String numeroAgencia,
			Double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento, Cliente cliente,
			Double valorizacaoMensal, Integer mesesCarencia, Integer qtdMaximaTransferencia) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, dataFechamento,
				motivoFechamento, cliente);
		this.valorizacaoMensal = valorizacaoMensal;
		this.mesesCarencia = mesesCarencia;
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public Integer getQtdMaximaTransferencia() {
		return qtdMaximaTransferencia;
	}

	public void setQtdMaximaTransferencia(Integer qtdMaximaTransferencia) {
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public Integer getMesesCarencia() {
		return mesesCarencia;
	}

	public void setMesesCarencia(Integer mesesCarencia) {
		this.mesesCarencia = mesesCarencia;
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
		double resultado = 0.0;
		cal.setTime(new Date());
		int diaValorizacao = 26;
		int hoje = cal.get(Calendar.DAY_OF_MONTH);

		if (diaValorizacao == hoje) {
			System.out.printf("Seu saldo é: %.2f\n", this.saldo);
			resultado = this.saldo * getValorizacaoMensal();
			this.saldo += resultado;
			System.out.printf("Devido a valorização de %.2f seu saldo agora é de: %.2f\n", this.valorizacaoMensal, this.saldo);
		} else {
			System.out.println("Não ocorreu juros no seu saldo\n");
		}
	}

	@Override
	public void saque(double saque) {
		LocalDate mesAtual = LocalDate.now();
		LocalDate finalCarencia = getDataAbertura().plusMonths(getMesesCarencia());

		if (mesAtual.equals(finalCarencia) || mesAtual.isAfter(finalCarencia)) {
			super.saque(saque);
		} else {
			super.saque(saque + 5.0);
			System.out.println("Foi feito o saque, porém com um desconto de R$5,00\n");
		}

	}

	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}
}