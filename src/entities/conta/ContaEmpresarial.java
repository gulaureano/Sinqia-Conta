package entities.conta;

import java.time.LocalDate;

import entities.cliente.Cliente;

public class ContaEmpresarial extends Conta {

	private String nomeEmpresa;
	private int contadorArray;
	ContaEmpresarial[] contaE = new ContaEmpresarial[6];

	public ContaEmpresarial(String nomeBanco, Integer codigoIdentificadorBanco, Integer numeroConta,
			Integer numeroAgencia, Double saldo, LocalDate dataAbertura, Cliente cliente, String nomeEmpresa) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, cliente);
		this.nomeEmpresa = nomeEmpresa;
	}

	public ContaEmpresarial() {
		super();
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	// M�TODO PARA SAQUE SIMPLES
	@Override
	public void saque(double saque) {
		if (((getSaldo() - saque) >= 0)) {
			this.saldo -= saque;
		} else {
			System.out.println("Seu saldo � insulficiente para esta opera��o");
		}

	}

	// M�TODO PARA DEP�SITO SIMPLES
	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Nome da Empresa: " + getNomeEmpresa() + "\n");
		return sb.toString();
	}

	// M�TODOS DO EXERCICIO 3

	public void adicionaArrayContaEmpresarial(ContaEmpresarial conta) {
		if (contadorArray < contaE.length) {
			contaE[contadorArray] = conta;
			contadorArray++;
			System.out.println("Foi implementado a conta passada no array\n");
		} else {
			System.out.println("Seu Array est� cheio\n");
		}
	}

	public void getPrimeiraContaEmpresarialNoArray() {
		if (contaE[0] != null) {
			System.out.println(contaE[0]);
		} else {
			System.out.println("Seu Array est� v�zio");
			;
		}
	}

	public void getUltimaContaEmpresarialNoArray() {
		System.out.println(contaE[contadorArray - 1]);
	}

	public void getTamanhoArrayContaEmpresarial() {
		System.out
				.println("O tamanho do array �: " + contaE.length + " e est�o ocupados " + contadorArray + " posi��es");
	}

}
