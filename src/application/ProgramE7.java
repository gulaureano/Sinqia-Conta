package application;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE7 {

	public static void main(String[] args) {
		/*JA NESTE EXERCICIO, TEMOS UMA LISTA QUE ACEITA DOIS TIPO DE COISAS, OU DUAS LISTAS, OU UMA
		 * LISTA E UM TIPO DE COISA, DEPENDE DO USO DE CADA UM, POR EXEMPLO, PODEMOS TER UMA LISTA DE CONTA
		 * QUE UM DETERMINADO CLIENTE TEM, ADICIONANDO AS CONTAS DESSE CLIENTE NESSA LISTA QUE ACEITA DUAS, E 
		 * UMA CARACTERISTICA INTERESSANTE É QUE ELA NÃO ACEITA CHAVES REPETIDAS, CASO VOCE TENTE INSERIR ALGUMA 
		 * CHAVE REPETIDA, NA CHAVE REPETIDA ELE MUDA O VALOR DA CHAVE CORRESPONDENTE*/
		
		
		//MEUS 9 CLIENTES
		Cliente clienteAlberto = new Cliente("Alberto", 10, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteLuiz = new Cliente("Luiz", 8, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteCarlos = new Cliente("Carlos", 2, 970.0, TipoCliente.FUNCIONARIO_BANCO);
		Cliente clienteMariana = new Cliente("Mariana", 1, 320.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteFlavia = new Cliente("Flavia", 3, 750.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteJenifer = new Cliente("Jenifer", 88, 780.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteAndreia = new Cliente("Andreia", 7, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteFabio = new Cliente("Fabio", 5, 790.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteHoracio = new Cliente("Horacio", 5, 790.0, TipoCliente.SERVIDOR_PUBLICO);
		
		//MINHAS 10 CONTAS
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Itau", "45", "01", "1", 1000.0,
				LocalDate.parse("2003-09-06"), null, null, clienteAlberto, 0.25, 3, 5);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", "89", "02", "1", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteAlberto, 5, 5);
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
		
		Map<Cliente, Conta> myMapClient = new HashMap<>();
		
		//COLOCANDO MEUS MINHAS 10 CONTAS NO MAP
		myMapClient.put(clienteAlberto, contaPoupanca1);
		myMapClient.put(clienteLuiz, contaCorrente1);
		myMapClient.put(clienteCarlos, contaEmpresarial1);
		myMapClient.put(clienteMariana, contaPoupanca2);
		myMapClient.put(clienteFlavia, contaCorrente2);
		myMapClient.put(clienteJenifer, contaEmpresarial2);
		myMapClient.put(clienteAndreia, contaPoupanca3);
		myMapClient.put(clienteFabio, contaCorrente3);
		myMapClient.put(clienteHoracio, contaEmpresarial3);
		myMapClient.put(clienteAlberto, contaPoupanca4);
		
		
		
		for (Cliente client : myMapClient.keySet()){
			System.out.println(client);
		}
		

	}

}
