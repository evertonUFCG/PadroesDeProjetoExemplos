package edu.psoft.observer;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
	private float temperatura;
	private float umidade;
	private float pressao;

	private List<ObservadorDados> observadores; 

	public EstacaoMeteorologica() {
		observadores = new ArrayList<ObservadorDados>();
	}

	public void setMedicoes(
			float temperatura,
			float umidade,
			float pressao ){

		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
	}

	public void atualizaDados(float temperatura, float umidade, float pressao) {
		setMedicoes(temperatura, umidade, pressao);
		notificaObservadores();
	}

	public void adicionaObservador(ObservadorDados observer ){
		observadores.add( observer );
	}

	public void removeObservador( ObservadorDados observer ){
		int index = observadores.indexOf( observer );
		if( index > -1 ){
			observadores.remove( observer );
		}
	}

	public void notificaObservadores(){ 
		for(ObservadorDados o :observadores ){
			o.atualizar( temperatura, umidade, pressao );
		}
	}
}
