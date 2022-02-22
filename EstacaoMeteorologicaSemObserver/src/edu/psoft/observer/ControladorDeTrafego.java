package edu.psoft.observer;

public class ControladorDeTrafego {

	public void atualizar(float temperatura, float umidade, float pressao) {
		System.out.println("Controlador consumindo os dados: "+ temperatura+ ", "+ umidade + ", " + pressao);
	}
}
