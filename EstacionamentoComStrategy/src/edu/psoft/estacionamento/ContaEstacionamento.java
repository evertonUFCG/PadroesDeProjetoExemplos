package edu.psoft.estacionamento;

public class ContaEstacionamento {
	private ComportamentoCalculo comportamentoCalculo;

	private int duracaoMin;

	public void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}

	public ContaEstacionamento(ComportamentoCalculo comportamentoCalculo, int duracaoMin) {
		this.comportamentoCalculo = comportamentoCalculo;
		this.duracaoMin = duracaoMin;
	}

	public double calcularPreco() {
		return comportamentoCalculo.calcularPreco(duracaoMin);
	}
	
	public void setComportamentoCalculo(ComportamentoCalculo comportamentoCalculo) {
		this.comportamentoCalculo = comportamentoCalculo;
	}
}
