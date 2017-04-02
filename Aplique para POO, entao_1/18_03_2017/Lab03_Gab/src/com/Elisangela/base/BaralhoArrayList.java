/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Elisangela.base;

import java.util.ArrayList;
import java.util.Collections;

import com.Elisangela.util.Util;

public class BaralhoArrayList {
	private ArrayList<CartaLacaio> vetorCartas;

	public BaralhoArrayList() {
		vetorCartas = new ArrayList<CartaLacaio>();
	}

	public void adicionarCarta(CartaLacaio card) {
		if (vetorCartas.size() < Util.MAX_CARDS)
			vetorCartas.add(card);
	}

	public CartaLacaio comprarCarta() {
		CartaLacaio lac = vetorCartas.get(vetorCartas.size() - 1);
		vetorCartas.remove(vetorCartas.size() - 1);
		return lac;
	}

	public void embaralhar() {
		Collections.shuffle(vetorCartas);
		// Comandos para imprimir as cartas em ordem reversa aqui
		int q = 0;
		for (int k = vetorCartas.size() - 1; k >= 0; k--) {
			System.out.println((q + 1) + "ª carta: " + vetorCartas.get(k));
			q++;
		}
	}

}
