package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE5 {

	public static void main(String[] args) {
		
		List<Conta> arrayConta = new ArrayList<>();
		List<Conta> arrayContaDuplicadas = new ArrayList<>();
		
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

		// INSTANCIADOS TRÊS TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Itau", "45", "01", "1", 1000.0,
				LocalDate.parse("2003-09-06"), null, null, clienteAlberto, 0.25, 3, 5);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", "89", "02", "1", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteFernando, 5, 5);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", "43", "03", "1", 10000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteLuiz, "Mitsubhisi");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Bradesco", "67", "04", "1", 1500.0,
				LocalDate.parse("1992-07-04"), null, null, clienteCarlos, 0.5, 3, 4);
		ContaCorrente contaCorrente2 = new ContaCorrente("Nubank", "43", "05", "1", 2000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMariana, 5, 5);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial("C6 Bank", "23", "06", "1", 50000.0,
				LocalDate.parse("2012-07-13"), null, null, clienteFlavia, "Chevrolet");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca("Neon", "81", "07", "1", 3000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteJenifer, 0.6, 3, 4);
		ContaCorrente contaCorrente3 = new ContaCorrente("Neon", "81", "08", "1", 2500.0,
				LocalDate.parse("2017-05-05"), null, null, clienteAndreia, 5, 5);
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial("Itau", "89", "9", "1", 70000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteFabio, "Ford");
		ContaPoupanca contaPoupanca4 = new ContaPoupanca("C6 Bank", "23", "85", "1", 3560.0,
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
		
		//---------------------------MAIS 10 CONTAS DUPLICADAS------------------------------
		ContaPoupanca contaPoupancaIgual1 = new ContaPoupanca("Itau", "45", "01", "1", 1000.0,
				LocalDate.parse("2003-09-06"), null, null, clienteAlberto, 0.25, 3, 5);
		ContaCorrente contaCorrenteIgual1 = new ContaCorrente("Itau", "89", "02", "1", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteFernando, 5, 5);
		ContaEmpresarial contaEmpresarialIgual1 = new ContaEmpresarial("Nubank", "43", "03", "1", 10000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteLuiz, "Mitsubhisi");
		ContaPoupanca contaPoupancaIgual2 = new ContaPoupanca("Bradesco", "67", "04", "1", 1500.0,
				LocalDate.parse("1992-07-04"), null, null, clienteCarlos, 0.5, 3, 4);
		ContaCorrente contaCorrenteIgual2 = new ContaCorrente("Nubank", "43", "05", "1", 2000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMariana, 5, 5);
		ContaEmpresarial contaEmpresarialIgual2 = new ContaEmpresarial("C6 Bank", "23", "06", "1", 50000.0,
				LocalDate.parse("2012-07-13"), null, null, clienteFlavia, "Chevrolet");
		ContaPoupanca contaPoupancaIgual3 = new ContaPoupanca("Neon", "81", "07", "1", 3000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteJenifer, 0.6, 3, 4);
		ContaCorrente contaCorrenteIgual3 = new ContaCorrente("Neon", "81", "08", "1", 2500.0,
				LocalDate.parse("2017-05-05"), null, null, clienteAndreia, 5, 5);
		ContaEmpresarial contaEmpresarialIgual3 = new ContaEmpresarial("Itau", "89", "9", "1", 70000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteFabio, "Ford");
		ContaPoupanca contaPoupancaIgual4 = new ContaPoupanca("C6 Bank", "23", "85", "1", 3560.0,
				LocalDate.parse("1997-10-05"), null, null, clienteHoracio, 0.45, 3, 4);
		
		
		arrayConta.add(contaPoupanca1);
		arrayConta.add(contaCorrente1);
		arrayConta.add(contaEmpresarial1);
		arrayConta.add(contaPoupanca2);
		arrayConta.add(contaCorrente2);
		arrayConta.add(contaEmpresarial2);
		arrayConta.add(contaPoupanca3);
		arrayConta.add(contaCorrente3);
		arrayConta.add(contaEmpresarial3);
		arrayConta.add(contaPoupanca4);
		arrayConta.add(contaCorrente4);
		arrayConta.add(contaEmpresarial4);
		arrayConta.add(contaPoupanca5);
		arrayConta.add(contaCorrente5);
		arrayConta.add(contaEmpresarial5);
		arrayConta.add(contaPoupanca6);
		arrayConta.add(contaCorrente6);
		arrayConta.add(contaEmpresarial6);
		arrayConta.add(contaPoupanca7);
		arrayConta.add(contaCorrente7);
		arrayConta.add(contaPoupancaIgual1);
		arrayConta.add(contaCorrenteIgual1);
		arrayConta.add(contaEmpresarialIgual1);
		arrayConta.add(contaPoupancaIgual2);
		arrayConta.add(contaCorrenteIgual2);
		arrayConta.add(contaEmpresarialIgual2);
		arrayConta.add(contaPoupancaIgual3);
		arrayConta.add(contaCorrenteIgual3);
		arrayConta.add(contaEmpresarialIgual3);
		arrayConta.add(contaPoupancaIgual4);
		
		for (int i=0; i < arrayConta.size(); i++) {
			for (int j=i+1; j< arrayConta.size(); j++) {
				if (arrayConta.get(i).equals(arrayConta.get(j))) {
					arrayContaDuplicadas.add(arrayConta.get(j));
					arrayConta.remove(j);
				}
			}
		}
		
		System.out.println(arrayContaDuplicadas.size());
		System.out.println(arrayConta.size());
		
		Collections.sort(arrayContaDuplicadas);
		for (Conta list : arrayContaDuplicadas) {
			System.out.println("Agencia: " + list.getNumeroAgencia());
			System.out.println("Conta: " + list.getNumeroConta());
			System.out.println();
		}

	}

}
