import java.util.Random;


// Carta e Baralho devem estar no mesmo pacote (package)

public class Baralho {

	Carta[] vetorCartas;
	int nCartas;
	static Random gerador; // Estático: Por quê ?
	
	public Baralho() {
		vetorCartas = new Carta[10];
		nCartas = 0;
		if(gerador == null)
			gerador = new Random();
	}

	/**
	 * Nesta atividade os alunos irão utilizar:
	 * - 1. Programar a classe Baralho
	 * - 2. Inicializar a classe Baralho corretamente: array, objeto estático e int.
	 * - 3. Declarar um objeto Random como estático para a classe Baralho.
	 * - 4. Criar os métodos adicionarCarta() e comprarCarta() adicionando e retirando sempre do final do array.
	 * - 5. Programar o método de embaralhar (ideia do fábio).
	 * - 6. O método de embaralhar, após embaralhar, deve imprimir as cartas na ordem que ficou.
	 * - 7. Por fim, os alunos devem criar uma lista de cartas, usar o método de embaralhar duas vezes.
	 */
	
	// Questões a serem respondidas:
	// (No método construtor) O que acontece se adicionarmos mais de 10 cartas no Baralho, do jeito que está ? Que tipo de erro o Java acusará ? [Se não souber, teste!]
	// (No método comprarCarta) O que acontece se chamarmos o método com o baralho vazio ? Que tipo de erro o Java acusará ? [Se não souber, teste!]
	// (Na declaração do gerador) Qual a vantagem em eficiência de ter o objeto gerador como estático, se criássemos vários Baralhos ?
	// (No método construtor) Porque a variavel gerador é comparada com null ? O que aconteceria se retirássemos a linha do if ? Haveria um erro de compilação ou apenas um erro de lógica ?
	
	// Questão a ser pensada (não precisa responder):
	// (No método embaralhar) Será que a rotina apresentada garante distribuição uniforme no embaralhamento ? Isto é, para uma dada carta em um baralho de n posições possíveis, ela possui 1/n de chance
	// de estar em cada uma das posições ?
	// OBS: Esta questão não está valendo ponto.
	// (No método comprarCarta) Como ficaria a rotina se quiséssemos comprar a carta do índice 0 do array vetorCartas ? A rotina ficaria mais pesada computacionalmente ?
	// OBS: Esta questão não está valendo ponto.
	
	public void adicionarCarta (Carta card){
		vetorCartas[nCartas] = card;
		nCartas++;
	}
	
	public Carta comprarCarta (){
		nCartas--;
		return vetorCartas[nCartas];
	}
	
	public void embaralhar(){
		for(int i = 1; i < nCartas; i++){
			int j = gerador.nextInt(i+1); // Sorteia um número entre [0,i]
			if(j != i){ // Se a posição sorteada for diferente, troque as cartas destas posições.
				Carta a = vetorCartas[i];
				Carta b = vetorCartas[j];
				vetorCartas[i] = b;
				vetorCartas[j] = a;
			}
		}
		// Imprimir as cartas em ordem de compra (ordem reversa do array)
		int q = 0;
		for(int k = nCartas-1; k >= 0; k--){
			System.out.println((q+1)+"a carta: "+vetorCartas[k]);
			q++;
		}
	}
	
	
	public static void main(String[] args) {
		Carta myCard = new Carta("Mago Negro", 7, 2, 5);
		Carta myCard2 = new Carta("Mago Branco", 7, 2, 5);
		Carta myCard3 = new Carta("Mago Cinza", 7, 2, 5);
		Baralho deck = new Baralho();
		deck.adicionarCarta(myCard);
		deck.adicionarCarta(myCard2);
		deck.adicionarCarta(myCard3);
		deck.embaralhar();
		deck.embaralhar();
	}

}
