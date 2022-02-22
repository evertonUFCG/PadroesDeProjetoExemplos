package edu.psoft.bridge;

import java.util.Map;

public class SerializadorTXTCompactado extends Serializador{

	@Override
	public String gerarConteudo(Map<String, Object> propriedades) {
		return gerarConteudoTXT(propriedades);
	}
	private String gerarConteudoTXT(Map<String, Object> propriedades) {
		System.out.println("Criando conteúdo TXT");
		return "Conteúdo TXT";
	}

	@Override
	public byte[] posprocessar(byte[] bytes) {
		return compactar(bytes);
	}

	private byte[] compactar(byte[] bytes) {
		System.out.println("Compactando...");
		return new byte[1];
	}

}


