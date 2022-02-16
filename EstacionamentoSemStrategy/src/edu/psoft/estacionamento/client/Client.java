package edu.psoft.estacionamento.client;

import edu.psoft.estacionamento.ContaEstacionamento;
import edu.psoft.estacionamento.TipoDeCarro;

public class Client {

	public static void main(String[] args) {
		ContaEstacionamento contaCarga = new ContaEstacionamento(TipoDeCarro.CARGA, 50);
		System.out.println(contaCarga.calcularPreco());
		contaCarga = new ContaEstacionamento(TipoDeCarro.CARGA, 120);
		System.out.println(contaCarga.calcularPreco());
		
		ContaEstacionamento contaPasseio = new ContaEstacionamento(TipoDeCarro.PASSEIO, 50);
		System.out.println(contaPasseio.calcularPreco());
		contaPasseio = new ContaEstacionamento(TipoDeCarro.PASSEIO, 120);
		System.out.println(contaPasseio.calcularPreco());
	}

}
