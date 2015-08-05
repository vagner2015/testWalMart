package br.com.vagner.rotas.dto;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Trajeto {

	private String pontoOrigem;
	private String pontoDestino;
	private BigDecimal autonomia;
	private BigDecimal valorLitro;
	private BigDecimal distancia;
	private String rotaFinal;
	private BigDecimal custoTrajeto;
	
	public String getPontoOrigem() {
		return pontoOrigem;
	}
	public void setPontoOrigem(String pontoOrigem) {
		this.pontoOrigem = pontoOrigem;
	}
	public String getPontoDestino() {
		return pontoDestino;
	}
	public void setPontoDestino(String pontoDestino) {
		this.pontoDestino = pontoDestino;
	}
	public BigDecimal getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(BigDecimal autonomia) {
		this.autonomia = autonomia;
	}
	public BigDecimal getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(BigDecimal valorLitro) {
		this.valorLitro = valorLitro;
	}
	public BigDecimal getDistancia() {
		return distancia;
	}
	public void setDistancia(BigDecimal distancia) {
		this.distancia = distancia;
	}
	public String getRotaFinal() {
		return rotaFinal;
	}
	public void setRotaFinal(String rotaFinal) {
		this.rotaFinal = rotaFinal;
	}
	public BigDecimal getCustoTrajeto() {
		return custoTrajeto;
	}
	public void setCustoTrajeto(BigDecimal custoTrajeto) {
		this.custoTrajeto = custoTrajeto;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
