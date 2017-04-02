package base;

import java.util.ArrayList;
import java.util.Collections;

import base.cartas.Carta;
import Util.Util;

public class BaralhoArrayList {
	private ArrayList<Carta> vetorCartas;

	public BaralhoArrayList() {
		vetorCartas = new ArrayList<Carta>();
	}

	public void adicionarCarta(Carta card) {
		if (vetorCartas.size() < Util.MAX_CARDS)
			vetorCartas.add(card);
	}

	public Carta comprarCarta() {
		Carta lac = vetorCartas.get(vetorCartas.size() - 1);
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
