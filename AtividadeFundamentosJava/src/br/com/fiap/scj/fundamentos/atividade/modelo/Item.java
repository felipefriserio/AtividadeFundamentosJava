package br.com.fiap.scj.fundamentos.atividade.modelo;

public class Item {
	
	public Item() {}
	
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
