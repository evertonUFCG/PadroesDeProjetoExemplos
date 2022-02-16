package edu.psoft.estacionamento.client;

import edu.psoft.estacionamento.ContaCarga;
import edu.psoft.estacionamento.ContaEstacionamento;
import edu.psoft.estacionamento.ContaPasseio;

public class Client {

	public static void main(String[] args) {
		ContaEstacionamento contaCarga = new ContaEstacionamento(new ContaCarga(), 50);
		System.out.println(contaCarga.calcularPreco());
		contaCarga.setDuracaoMin(120);
		System.out.println(contaCarga.calcularPreco());
		
		ContaEstacionamento contaPasseio = new ContaEstacionamento(new ContaPasseio(), 50);
		System.out.println(contaPasseio.calcularPreco());
		contaPasseio.setDuracaoMin(120);
		System.out.println(contaPasseio.calcularPreco());
		
		contaPasseio.setComportamentoCalculo(new ContaCarga());
		System.out.println(contaPasseio.calcularPreco());
	}

}
