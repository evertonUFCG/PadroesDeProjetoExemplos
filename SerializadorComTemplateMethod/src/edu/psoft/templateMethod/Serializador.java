package edu.psoft.templateMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class Serializador {
	public static int TXT = 1;
	public static int XML = 2;
	
	public void gerarArquivo(int opcaoGeracao, String nome, 
			Map<String,Object> propriedades)
					throws IOException{

		String conteudo = "";
		if (opcaoGeracao == TXT)
			conteudo = gerarConteudoTXT(propriedades);
		else if (opcaoGeracao == XML)
			conteudo = gerarConteudoXML(propriedades);

		byte [] bytes = conteudo.getBytes();

		if (opcaoGeracao == TXT)
			//transforma bytes em
			bytes = criptografar(bytes);
		else if (opcaoGeracao == XML)
			bytes = compactar(bytes);

		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}

	private String gerarConteudoXML(Map<String, Object> propriedades) {
		System.out.println("Criando conteudo XML");
		return "Conteudo XML";
	}

	private String gerarConteudoTXT(Map<String, Object> propriedades) {
		System.out.println("Criando conteudo TXT");
		return "Conteudo TXT";
	}
	
	private byte[] compactar(byte[] bytes) {
		System.out.println("Compactando...");
		return new byte[1];
	}

	private byte[] criptografar(byte[] bytes) {
		System.out.println("Criptografando...");
		return new byte[1];
	}

}
