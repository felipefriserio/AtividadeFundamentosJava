package br.com.fiap.scj.fundamentos.atividade.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<ItemPedido> itensPedidos = new ArrayList<>();

	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setPedidos(List<ItemPedido> pedidos) {
		this.itensPedidos = pedidos;
	}
	
	public double getPreco() {
		double precoTotal = 0d;
		for (ItemPedido itemPedido : itensPedidos) {
			precoTotal += itemPedido.getPreco();
		}
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Carrinho [itensPedidos=" + itensPedidos + "]";
	}
}	
