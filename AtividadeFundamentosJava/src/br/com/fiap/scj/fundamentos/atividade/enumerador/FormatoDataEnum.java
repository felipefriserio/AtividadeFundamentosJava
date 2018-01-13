package br.com.fiap.scj.fundamentos.atividade.enumerador;

public enum FormatoDataEnum {
	DIA_MES_ANO("dd/MM/yyyy"),
	DIA_MES_ANO_HORA_MINUTO("dd/MM/yyyy kk:mm:ss");
	
	private String formato;
	
	FormatoDataEnum(String formato) {
		this.formato = formato;
	}
	
	public String getFormato() {
		return this.formato;
	}

}
