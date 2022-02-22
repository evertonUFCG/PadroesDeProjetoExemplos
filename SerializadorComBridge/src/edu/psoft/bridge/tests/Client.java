package edu.psoft.bridge.tests;

import java.io.IOException;
import java.util.HashMap;

import edu.psoft.bridge.*;

class Client {

	public static void main(String args[]) {
		Serializador serializadorTXT = new SerializadorTXT(new Compactador());
		Serializador serializadorXML = new SerializadorXML(new Compactador());
		HashMap<String, Object> properties = new HashMap<String,Object>();
		properties.put("p1", null);
		try {
			serializadorTXT.gerarArquivo("propriedades", properties);
			serializadorXML.gerarArquivo("propriedades", properties);
			
			serializadorTXT = new SerializadorTXT(new Criptografador());
			serializadorXML = new SerializadorXML(new Criptografador());
		
			serializadorTXT.gerarArquivo("propriedades", properties);
			serializadorXML.gerarArquivo("propriedades", properties);
		} catch (IOException e) {
		}
	}
}
