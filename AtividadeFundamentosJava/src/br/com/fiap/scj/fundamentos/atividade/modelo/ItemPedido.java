package br.com.fiap.scj.fundamentos.atividade.modelo;

public class ItemPedido {
	
	private Item item = new Item();
	private int quantidade;
	
	public ItemPedido(String nomeItem, int quantidade, double preco ) {
		this.item.setNome(nomeItem);
		this.item.setPreco(preco);
		this.quantidade = quantidade;
	}
	
	
	public String getNomeItem() {
		return this.item.getNome();
	}
	public void setNomeItem(String nomeItem) {
		this.item.setNome(nomeItem);
	}
	
	public double getPrecoItem() {
		return item.getPreco();
	}
	public void setPrecoItem(int itemId) {
		this.item.setPreco(itemId);
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return this.getPrecoItem() * this.getQuantidade();
	}


	@Override
	public String toString() {
		return "ItemPedido [item=" + item + ", quantidade=" + quantidade + "]";
	}
}
