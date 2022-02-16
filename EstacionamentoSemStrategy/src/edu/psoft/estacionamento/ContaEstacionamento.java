package edu.psoft.estacionamento;

public class ContaEstacionamento {
	private TipoDeCarro tipo;
	private int duracaoMin;

	public ContaEstacionamento(TipoDeCarro tipo, int duracaoMin) {
		this.tipo = tipo;
		this.duracaoMin = duracaoMin;
	}

	public double calcularPreco() {
		double preco = 0.0;
		if (TipoDeCarro.PASSEIO.equals(tipo))
			preco = Math.ceil((double)duracaoMin/60) * 1.25 + 5;
		else 
			if (TipoDeCarro.CARGA.equals(tipo))
				preco = Math.ceil((double)duracaoMin/60) * 2 + 5;
		return preco;
	}
}
