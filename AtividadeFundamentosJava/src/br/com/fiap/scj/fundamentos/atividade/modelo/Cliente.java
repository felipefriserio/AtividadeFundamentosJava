package br.com.fiap.scj.fundamentos.atividade.modelo;

import java.util.List;

public class Cliente {
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	private String nome;
	private Carrinho carrinho = new Carrinho();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente querComprarNaQtdPeloPreco(String nomeItem, int quantidade, double preco) {
		this.carrinho.getItensPedidos().add(new ItemPedido(nomeItem, quantidade, preco));
		return this;
	}
	
	public double getPrecoDaCompra() {
		return this.carrinho.getPreco();
	}
	
	public List<ItemPedido> getItensPedidosDaCompra(){
		return this.carrinho.getItensPedidos();		
	}
}
