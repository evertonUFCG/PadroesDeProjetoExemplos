package edu.psoft.observer;

public class EstacaoMeteorologica {
	private float temperatura;
	private float umidade;
	private float pressao;
	
	private Laboratorio laboratorio;
	private Prefeitura prefeitura;
	private ControladorDeTrafego controladorDeTrafego;

	public EstacaoMeteorologica(Laboratorio laboratorio, Prefeitura prefeitura,
			ControladorDeTrafego controladorDeTrafego) {
		this.laboratorio = laboratorio;
		this.prefeitura = prefeitura;
		this.controladorDeTrafego = controladorDeTrafego;
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
		laboratorio.atualizar(temperatura, umidade, pressao);
		prefeitura.atualizar(temperatura, umidade, pressao);
		controladorDeTrafego.atualizar(temperatura, umidade, pressao);
	}
}
