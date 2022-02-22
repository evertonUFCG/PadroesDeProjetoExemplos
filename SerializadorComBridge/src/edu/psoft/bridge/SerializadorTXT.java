package edu.psoft.bridge;

import java.util.Map;

public class SerializadorTXT extends Serializador{
	public SerializadorTXT(Posprocessador posprocessador) {
		super(posprocessador);
	}
	
	@Override
	public String gerarConteudo(Map<String, Object> propriedades) {
		return gerarConteudoTXT(propriedades);
	}
	private String gerarConteudoTXT(Map<String, Object> propriedades) {
		System.out.println("Criando conteúdo TXT");
		return "Conteúdo TXT";
	}
}


