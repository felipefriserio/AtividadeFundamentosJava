package br.com.fiap.scj.fundamentos.atividade.enumerador;

public enum MoedaEnum {
	REAL("R$"),
	DOLAR("$"),
	EURO("€");
	
	private String simboloMoeda;
	
	MoedaEnum(String simboloMoeda) {
		this.simboloMoeda = simboloMoeda;
	}
	
	public String getSimbolo() {
		return this.simboloMoeda;
	}
}
