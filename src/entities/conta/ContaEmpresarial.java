package entities.conta;

import java.time.LocalDate;

import entities.cliente.Cliente;

public class ContaEmpresarial extends Conta {

	private String nomeEmpresa;

	

	public ContaEmpresarial(String nomeBanco, String codigoIdentificadorBanco, String numeroConta, String numeroAgencia,
			Double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento, Cliente cliente,
			String nomeEmpresa) {
		super(nomeBanco, codigoIdentificadorBanco, numeroConta, numeroAgencia, saldo, dataAbertura, dataFechamento,
				motivoFechamento, cliente);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Nome da Empresa: " + getNomeEmpresa() + "\n");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			System.out.println("As contas são iguais");
			return true;
		}
		if (obj == null){
			System.out.println("As contas são diferentes");
			return false;
		}
		if (getClass() != obj.getClass()){
			System.out.println("As contas são diferentes");
			return false;
		}
		Conta other = (Conta) obj;
		if (numeroAgencia == null) {
			if (other.numeroAgencia != null){
				System.out.println("As contas são diferentes");
				return false;
			}
		} else if (!numeroAgencia.equals(other.numeroAgencia)){
			System.out.println("As contas são diferentes");
			return false;
		}
		if (numeroConta == null) {
			if (other.numeroConta != null){
				System.out.println("As contas são diferentes");
				return false;
			}
		} else if (!numeroConta.equals(other.numeroConta)){
			System.out.println("As contas são diferentes");
			return false;
		}
		System.out.println("As contas são iguais");
		return true;
	}
}
