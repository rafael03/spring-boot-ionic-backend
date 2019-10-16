package com.rafael.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rafael.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/mm/yyyy HH:mm")
	private Date dataVencidmento;
	@JsonFormat(pattern = "dd/mm/yyyy HH:mm")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencidmento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencidmento = dataVencidmento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencidmento() {
		return dataVencidmento;
	}

	public void setDataVencidmento(Date dataVencidmento) {
		this.dataVencidmento = dataVencidmento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
