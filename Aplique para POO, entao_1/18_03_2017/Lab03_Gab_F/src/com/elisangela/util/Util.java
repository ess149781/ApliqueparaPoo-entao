package com.elisangela.util;

import com.elisangela.base.CartaLacaio;


public class Util {
	public static int MAX_CARDS = 30;
	
	public static void buffar(CartaLacaio lac, int a){
		if(a > 0){
			lac.setAtaque(lac.getAtaque() + a);
			lac.setVidaAtual(lac.getVidaAtual() + a);
			alteraNomeFortalecido(lac);
		}
			
	}
	
	public static void buffar(CartaLacaio lac, int a, int v){
		if(a > 0 && v > 0){
			lac.setAtaque(lac.getAtaque() + a);
			lac.setVidaAtual(lac.getVidaAtual() + v);
			alteraNomeFortalecido(lac);
		}
			
	}

	private static void alteraNomeFortalecido(CartaLacaio lac) {
		lac.setNome(lac.getNome() + " Fortalecido");
	}
}
