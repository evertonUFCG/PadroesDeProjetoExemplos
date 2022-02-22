package edu.psoft.bridge;

public class Criptografador extends Posprocessador{
	@Override
	public byte[] posprocessar(byte[] bytes) {
		return criptografar(bytes);
	}
	private byte[] criptografar(byte[] bytes) {
		System.out.println("Criptografando...");
		return new byte[1];
	}

}
