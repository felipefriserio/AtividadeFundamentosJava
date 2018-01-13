package br.com.fiap.scj.fundamentos.atividade.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.scj.fundamentos.atividade.core.CriaArquivo;
import br.com.fiap.scj.fundamentos.atividade.core.EfetuaPagamento;
import br.com.fiap.scj.fundamentos.atividade.enumerador.MoedaEnum;
import br.com.fiap.scj.fundamentos.atividade.modelo.Cliente;

public class Main {
	
	static Cliente cliente1 = new Cliente("Joao");
	static Cliente cliente2 = new Cliente("Maria");
	static Cliente cliente3 = new Cliente("Ana");

	
	public static void main(String[] args) {

		cliente1.querComprarNaQtdPeloPreco("TV 50 4k LG", 1, 2500.0)
				.querComprarNaQtdPeloPreco("Maquina Fotografica", 2, 700.0);
		
		cliente2.querComprarNaQtdPeloPreco("PS4", 1, 1500.0)
				.querComprarNaQtdPeloPreco("Fone de ouvido PS4", 1, 99.9)
				.querComprarNaQtdPeloPreco("Controle PS4", 1, 150.0);
		
		cliente3.querComprarNaQtdPeloPreco("Microondas Brastemp", 1, 770.0);
		
		
		List<Cliente> listaDeClientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));
		
		for (Cliente cliente : listaDeClientes) {
				Thread compra = new Thread(new EfetuaPagamento(cliente, MoedaEnum.REAL, new CriaArquivo()), "Thread de pagamento do cliente "+ cliente.getNome());
				compra.run();
		}
	}

}
