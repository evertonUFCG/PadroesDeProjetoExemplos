package edu.psoft.estacionamento;

public class ContaCarga implements ComportamentoCalculo {

	@Override
	public double calcularPreco(int duracaoMin) {
		return Math.ceil((double)duracaoMin/60) * 2 + 5;
	}

}
