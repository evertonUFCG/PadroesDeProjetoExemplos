package edu.psoft.observer;

public class Laboratorio implements ObservadorDados{

	public void atualizar(float temperatura, float umidade, float pressao) {
		System.out.println("Laborat�rio consumindo os dados: "+ temperatura+ ", "+ umidade + ", " + pressao);
	}

}