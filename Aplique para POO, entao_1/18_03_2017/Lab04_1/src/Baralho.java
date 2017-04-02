package base;

import java.util.Random;

import base.cartas.Carta;

public class Baralho {
	private Carta[] vetorCartas;
	private int nCartas;
	private static Random gerador = new Random();

	public Baralho() {
		vetorCartas = new Carta[10];
		nCartas = 0;
	}

	public void adicionarCarta(Carta card) {
		vetorCartas[nCartas] = card;
		nCartas++;
	}

	public Carta comprarCarta() {
		nCartas--;
		return vetorCartas[nCartas];
	}

	public void embaralhar() {
		int i, j;

		for (i = 1; i < nCartas; i++) {
			j = gerador.nextInt(i + 1); // Sorteia um número dentre [0,i]
			if (j != i) {
				Carta a = vetorCartas[i];
				Carta b = vetorCartas[j];
				vetorCartas[i] = b;
				vetorCartas[j] = a;
			}
		}
		// Comandos para imprimir as cartas em ordem reversa aqui
		int q = 0;
		for (int k = nCartas - 1; k >= 0; k--) {
			System.out.println((q + 1) + "ª carta: " + vetorCartas[k]);
			q++;
		}
	}

}
