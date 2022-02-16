package edu.psoft.templateMethod.test;

import java.io.IOException;
import java.util.HashMap;

import edu.psoft.templateMethod.Serializador;


class Client {
	
	public static void main(String args[]) {
		Serializador serializadorTXT = new Serializador();
		Serializador serializadorXML = new Serializador();
		HashMap<String, Object> properties = new HashMap<String,Object>();
		properties.put("p1", null);
		try {
			serializadorTXT.gerarArquivo(Serializador.TXT,"propriedades", properties);
			serializadorXML.gerarArquivo(Serializador.XML, "propriedades", properties);
		} catch (IOException e) {
		}
	}
	
}
