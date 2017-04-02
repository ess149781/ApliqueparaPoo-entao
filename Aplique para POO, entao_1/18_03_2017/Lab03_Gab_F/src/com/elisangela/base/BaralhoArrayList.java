package com.elisangela.base;

import java.util.ArrayList;
import java.util.Collections;

import com.elisangela.util.Util;

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
			System.out.println((q + 1) + "� carta: " + vetorCartas.get(k));
			q++;
		}
	}

}
