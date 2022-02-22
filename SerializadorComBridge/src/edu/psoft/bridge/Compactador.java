package edu.psoft.bridge;

public class Compactador extends Posprocessador {

	@Override
	public byte[] posprocessar(byte[] bytes) {
		return compactar(bytes);
	}
	
	private byte[] compactar(byte[] bytes) {
		System.out.println("Compactando...");
		return new byte[1];
	}

}
