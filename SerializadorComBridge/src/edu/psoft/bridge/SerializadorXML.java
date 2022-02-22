package edu.psoft.bridge;

import java.util.Map;

public class SerializadorXML extends Serializador{
	public SerializadorXML(Posprocessador posprocessador) {
		super(posprocessador);
	}
	@Override
	public String gerarConteudo(Map<String, Object> propriedades) {
		return gerarConteudoXML(propriedades);
	}
	private String gerarConteudoXML(Map<String, Object> propriedades) {
		System.out.println("Criando conteúdo XML");
		return "Conteúdo XML";
	}

}
