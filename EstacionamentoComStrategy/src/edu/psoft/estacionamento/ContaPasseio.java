package edu.psoft.estacionamento;

public class ContaPasseio implements ComportamentoCalculo {

	@Override
	public double calcularPreco(int duracaoMin) {
		return Math.ceil((double)duracaoMin/60) * 1.25 + 5;
	}

}
