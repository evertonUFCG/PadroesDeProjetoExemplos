package edu.psoft.state.test;

import edu.psoft.state.Mario;

public class Client {
	public static void main(String[] args) {
		Mario mario = new Mario();
		mario.pegarCogumelo();
		mario.pegarPena();
		mario.levarDano();
		mario.pegarFlor();
		mario.pegarFlor();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
	}
}
