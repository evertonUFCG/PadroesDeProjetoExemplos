package edu.psoft.bridge.tests;

import java.io.IOException;
import java.util.HashMap;

import edu.psoft.bridge.*;

class Client {

	public static void main(String args[]) {
		Serializador serializador = new SerializadorTXTCompactado();
		Serializador serializador2 = new SerializadorXMLCriptografado();
		HashMap<String, Object> properties = new HashMap<String,Object>();
		properties.put("p1", null);
		try {
			serializador.gerarArquivo("propriedades", properties);
			serializador2.gerarArquivo("propriedades", properties);
		} catch (IOException e) {
		}
	}
}
