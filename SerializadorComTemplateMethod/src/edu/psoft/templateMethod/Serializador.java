package edu.psoft.templateMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class Serializador {
	
	public void gerarArquivo(String nome, 
			Map<String,Object> propriedades)
					throws IOException{

		String conteudo = gerarConteudo(propriedades);

		byte [] bytes = conteudo.getBytes();

		bytes = posprocessar(bytes);

		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	public abstract String gerarConteudo(Map<String, Object> propriedades);
	
	public abstract byte[] posprocessar(byte[] bytes);

}
