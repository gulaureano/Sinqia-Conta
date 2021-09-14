package application;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE6 {

	public static void main(String[] args) {
		
		/*ESTE EXERCICIO É JUSTAMENTE PARA CORRIGIR O PROBLEMA QUE TIVEMOS COM O ARRAY ANTERIOR
		 * QUE É PARA NÃO ACEITAR ELEMENTOS REPETIDOS NA MINHA LISTA, CASO EU TENTE INSERIR
		 * ELE SIMPLESMENTE VAI IGNORAR E NÃO VAI COLOCAR*/
		
		Set<Conta> setSingleAccounts = new HashSet<>();
		Set<Conta> setGeneralAccounts = new HashSet<>();
		
//		10 CLIENTES
		Cliente clienteAlberto = new Cliente("Alberto", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteFernando = new Cliente("Fernando", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteLuiz = new Cliente("Luiz", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteCarlos = new Cliente("Carlos", 55666, 970.0, TipoCliente.FUNCIONARIO_BANCO);
		Cliente clienteMariana = new Cliente("Mariana", 435565478, 320.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteFlavia = new Cliente("Flavia", 1003, 750.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteJenifer = new Cliente("Jenifer", 121213, 780.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteAndreia = new Cliente("Andreia", 5649877, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteFabio = new Cliente("Fabio", 467589, 790.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteHoracio = new Cliente("Horacio", 56473, 790.0, TipoCliente.SERVIDOR_PUBLICO);
		
//		20 CONTAS ÚNICAS
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Itau", "45", "01", "1", 1000.0,
				LocalDate.parse("2003-09-06"), null, null, clienteAlberto, 0.25, 3, 5);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", "89", "02", "1", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteFernando, 5, 5);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", "43", "03", "2", 10000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteLuiz, "Mitsubhisi");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Bradesco", "67", "04", "2", 1500.0,
				LocalDate.parse("1992-07-04"), null, null, clienteCarlos, 0.5, 3, 4);
		ContaCorrente contaCorrente2 = new ContaCorrente("Nubank", "43", "05", "1", 2000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMariana, 5, 5);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial("C6 Bank", "23", "06", "3", 50000.0,
				LocalDate.parse("2012-07-13"), null, null, clienteFlavia, "Chevrolet");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca("Neon", "81", "07", "4", 3000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteJenifer, 0.6, 3, 4);
		ContaCorrente contaCorrente3 = new ContaCorrente("Neon", "81", "08", "5", 2500.0,
				LocalDate.parse("2017-05-05"), null, null, clienteAndreia, 5, 5);
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial("Itau", "89", "9", "1", 70000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteFabio, "Ford");
		ContaPoupanca contaPoupanca4 = new ContaPoupanca("C6 Bank", "23", "8", "1", 3560.0,
				LocalDate.parse("1997-10-05"), null, null, clienteHoracio, 0.45, 3, 4);
		ContaCorrente contaCorrente4 = new ContaCorrente("Neon", "81", "11", "1", 4789.0,
				LocalDate.parse("2002-07-20"), null, null, clienteAlberto, 5, 5);
		ContaEmpresarial contaEmpresarial4 = new ContaEmpresarial("Bradesco", "67", "2002", "6", 70000.0,
				LocalDate.parse("1992-07-04"), null, null, clienteFernando, "Fiat");
		ContaPoupanca contaPoupanca5 = new ContaPoupanca("Bradesco", "67", "2003", "9", 5000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteLuiz, 0.35, 3, 4);
		ContaCorrente contaCorrente5 = new ContaCorrente("C6 Bank", "23", "9802", "4", 3789.0,
				LocalDate.parse("2012-07-13"), null, null, clienteCarlos, 5, 5);
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial("Nubank", "43", "3469", "6", 90000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteMariana, "VolksWagen");
		ContaPoupanca contaPoupanca6 = new ContaPoupanca("Bradesco", "67", "2004", "9", 9000.0,
				LocalDate.parse("2017-05-05"), null, null, clienteFlavia, 0.25, 3, 4);
		ContaCorrente contaCorrente6 = new ContaCorrente("Itau", "89", "1004", "4", 6000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteJenifer, 5, 5);
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial("Neon", "81", "4003", "2", 200000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteAndreia, "Nissan");
		ContaPoupanca contaPoupanca7 = new ContaPoupanca("Bradesco", "67", "2005", "7", 15000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteFabio, 0.67, 3, 4);
		ContaCorrente contaCorrente7 = new ContaCorrente("C6 Bank", "23", "9803", "4", 17000.0,
				LocalDate.parse("1992-07-04"), null, null, clienteHoracio, 5, 5);
		
//		10 CONTAS DUPLICADAS
		ContaPoupanca contaPoupancaIgual1 = new ContaPoupanca("Itau", "45", "01", "1", 1000.0,
				LocalDate.parse("2003-09-06"), null, null, clienteAlberto, 0.25, 3, 5);
		ContaCorrente contaCorrenteIgual1 = new ContaCorrente("Itau", "89", "02", "1", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteFernando, 5, 5);
		ContaEmpresarial contaEmpresarialIgual1 = new ContaEmpresarial("Nubank", "43", "03", "2", 10000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteLuiz, "Mitsubhisi");
		ContaPoupanca contaPoupancaIgual2 = new ContaPoupanca("Bradesco", "67", "04", "2", 1500.0,
				LocalDate.parse("1992-07-04"), null, null, clienteCarlos, 0.5, 3, 4);
		ContaCorrente contaCorrenteIgual2 = new ContaCorrente("Nubank", "43", "05", "1", 2000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMariana, 5, 5);
		ContaEmpresarial contaEmpresarialIgual2 = new ContaEmpresarial("C6 Bank", "23", "06", "3", 50000.0,
				LocalDate.parse("2012-07-13"), null, null, clienteFlavia, "Chevrolet");
		ContaPoupanca contaPoupancaIgual3 = new ContaPoupanca("Neon", "81", "07", "4", 3000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteJenifer, 0.6, 3, 4);
		ContaCorrente contaCorrenteIgual3 = new ContaCorrente("Neon", "81", "08", "5", 2500.0,
				LocalDate.parse("2017-05-05"), null, null, clienteAndreia, 5, 5);
		ContaEmpresarial contaEmpresarialIgual3 = new ContaEmpresarial("Itau", "89", "9", "1", 70000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteFabio, "Ford");
		ContaPoupanca contaPoupancaIgual4 = new ContaPoupanca("C6 Bank", "23", "8", "1", 3560.0,
				LocalDate.parse("1997-10-05"), null, null, clienteHoracio, 0.45, 3, 4);
		
		//VINTE PRIMEIRAS CONTAS
		setSingleAccounts.add(contaPoupanca1);
		setSingleAccounts.add(contaCorrente1);
		setSingleAccounts.add(contaEmpresarial1);
		setSingleAccounts.add(contaPoupanca2);
		setSingleAccounts.add(contaCorrente2);
		setSingleAccounts.add(contaEmpresarial2);
		setSingleAccounts.add(contaPoupanca3);
		setSingleAccounts.add(contaCorrente3);
		setSingleAccounts.add(contaEmpresarial3);
		setSingleAccounts.add(contaPoupanca4);
		setSingleAccounts.add(contaCorrente4);
		setSingleAccounts.add(contaEmpresarial4);
		setSingleAccounts.add(contaPoupanca5);
		setSingleAccounts.add(contaCorrente5);
		setSingleAccounts.add(contaEmpresarial5);
		setSingleAccounts.add(contaPoupanca6);
		setSingleAccounts.add(contaCorrente6);
		setSingleAccounts.add(contaEmpresarial6);
		setSingleAccounts.add(contaPoupanca7);
		setSingleAccounts.add(contaCorrente7);
		
		//ADICIONANDO AS 10 DUPLICADAS EM OUTRO SET
		setGeneralAccounts.add(contaPoupancaIgual1);
		setGeneralAccounts.add(contaCorrenteIgual1);
		setGeneralAccounts.add(contaEmpresarialIgual1);
		setGeneralAccounts.add(contaPoupancaIgual2);
		setGeneralAccounts.add(contaCorrenteIgual2);
		setGeneralAccounts.add(contaEmpresarialIgual2);
		setGeneralAccounts.add(contaPoupancaIgual3);
		setGeneralAccounts.add(contaCorrenteIgual3);
		setGeneralAccounts.add(contaEmpresarialIgual3);
		setGeneralAccounts.add(contaPoupancaIgual4);
		
		
		
		System.out.println("Number of tries: " + (setSingleAccounts.size() + setGeneralAccounts.size()));
		System.out.println("Number of accounts placed: " + setSingleAccounts.size());

	}

}
