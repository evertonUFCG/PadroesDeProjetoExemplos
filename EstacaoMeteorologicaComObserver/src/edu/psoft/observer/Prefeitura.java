package edu.psoft.observer;

public class Prefeitura implements ObservadorDados{

	public void atualizar(float temperatura, float umidade, float pressao) {
		System.out.println("Prefeitura consumindo os dados: "+ temperatura+ ", "+ umidade + ", " + pressao);
	}
}
