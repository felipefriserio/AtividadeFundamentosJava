package br.com.fiap.scj.fundamentos.atividade.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.fiap.scj.fundamentos.atividade.contrato.AcaoAposPagamento;
import br.com.fiap.scj.fundamentos.atividade.enumerador.FormatoDataEnum;
import br.com.fiap.scj.fundamentos.atividade.enumerador.MoedaEnum;
import br.com.fiap.scj.fundamentos.atividade.modelo.Cliente;

public class EfetuaPagamento implements Runnable{
	private Cliente cliente;
	private MoedaEnum moeda;
	private AcaoAposPagamento acao;
	
	public EfetuaPagamento(Cliente cliente, MoedaEnum moedaEnum, AcaoAposPagamento acao) {
		this.cliente = cliente;
		this.moeda = moedaEnum;
		this.acao = acao;
	}

	@Override
	public void run() {
		try {
			StringBuilder sb = new StringBuilder();
			
			sb.append("\r\r ********************************************************************");
			sb.append("\r Efetuando pagamento do pedido do(a) cliente " + cliente.getNome().toUpperCase());
			sb.append("\r\r Data do pagamento: " + DataEHoraAgora());			
			sb.append("\r\r Preco Total do pedido: " + moeda.getSimbolo() + cliente.getPrecoDaCompra());
			sb.append("\r\r "+cliente.getItensPedidosDaCompra());
			
			acao.executa(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String DataEHoraAgora() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FormatoDataEnum.DIA_MES_ANO_HORA_MINUTO.getFormato());
	    return now.format(formatter);
	}
}
