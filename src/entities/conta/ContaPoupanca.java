package entities.conta;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import entities.cliente.Cliente;

public class ContaPoupanca extends Conta {

	private Double valorizacaoMensal;
	private Integer mesesCarencia;
	private Integer qtdMaximaTransferencia;
	private int contadorArray;
	ContaPoupanca[] contaP = new ContaPoupanca[7];

	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();

	public ContaPoupanca(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta, Integer numeroAgencia,
			Double saldo, LocalDate dataAbertura, Cliente cliente, Double valorizacaoMensal, Integer mesesCarencia,
			Integer qtdMaximaTransferencia) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
		this.valorizacaoMensal = valorizacaoMensal;
		this.mesesCarencia = mesesCarencia;
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public ContaPoupanca() {
		super();
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
		int diaValorizacao = 20;
		int hoje = cal.get(Calendar.DAY_OF_MONTH);

		if (diaValorizacao == hoje) {
			System.out.printf("Seu saldo é: %.2f\n", getSaldo());
			resultado = getSaldo() * getValorizacaoMensal();
			this.saldo += resultado;
			System.out.printf("Agora seu saldo devido a valorização é: %.2f\n", getSaldo());
		} else {
			System.out.println("Não ocorreu juros no seu saldo");
		}
	}

	@Override
	public void saque(double saque) {
		LocalDate mesAtual = LocalDate.now();
		LocalDate finalCarencia = getDataAbertura().plusMonths(getMesesCarencia());

		if (mesAtual.equals(finalCarencia) || mesAtual.isAfter(finalCarencia)) {
			if (!((getSaldo() - saque) < 0)) {
				this.saldo -= saque;
			} else {
				System.out.println("Seu saldo é insulficiente para esta operação");
			}
		} else {
			System.out.println("O tempo para saque ainda não ultrapassou " + getMesesCarencia() + " mese(s)");
		}
	}

	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}

	// MÉTODOS PARA O EXERCÍCIO 3

	public void adicionaArrayContaPoupança(ContaPoupanca conta) {
		if (contadorArray < contaP.length) {
			contaP[contadorArray] = conta;
			contadorArray++;
			System.out.println("Foi implementado a conta passada no array\n");
		} else {
			System.out.println("Seu Array está cheio\n");
		}
	}

	public void getPrimeiraContaPoupancaNoArray() {
		if (contaP[0] != null) {
			System.out.println(contaP[0]);
		} else {
			System.out.println("Seu Array está vázio");
			;
		}
	}

	public void getUltimaContaPoupancaNoArray() {
		System.out.println(contaP[contadorArray - 1]);
	}

	public void getTamanhoArrayContaPoupanca() {
		System.out
				.println("O tamanho do array é: " + contaP.length + " e estão ocupados " + contadorArray + " posições");
	}
}