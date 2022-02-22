package edu.psoft.observer.test;

import edu.psoft.observer.ControladorDeTrafego;
import edu.psoft.observer.EstacaoMeteorologica;
import edu.psoft.observer.Laboratorio;
import edu.psoft.observer.Prefeitura;

public class Client {

	public static void main(String[] args) {
		EstacaoMeteorologica estacao = new EstacaoMeteorologica(new Laboratorio(), new Prefeitura(), new ControladorDeTrafego());
		float temperatura = 30.2F;
		float umidade = 20.0F;
		float pressao = 5.2F;
		estacao.atualizaDados(temperatura, umidade, pressao);
		
		temperatura = 18.5F;
		umidade = 10.0F;
		pressao = 2.2F;
		estacao.atualizaDados(temperatura, umidade, pressao);
	}
}
