package edu.psoft.templateMethod;

import java.util.Map;

public class SerializadorXMLCriptografado extends Serializador{
	@Override
	public String gerarConteudo(Map<String, Object> propriedades) {
		return gerarConteudoXML(propriedades);
	}
	
	private String gerarConteudoXML(Map<String, Object> propriedades) {
		System.out.println("Criando conteúdo XML");
		return "Conteúdo XML";
	}
	
	@Override
	public byte[] posprocessar(byte[] bytes) {
		return criptografar(bytes);
	}

	private byte[] criptografar(byte[] bytes) {
		System.out.println("Criptografando...");
		return new byte[1];
	}

}
