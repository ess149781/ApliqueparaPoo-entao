import java.util.ArrayList;

/*
 * TRABALHO 1 - CÓDIGO DE EXEMPLO DE UTILIZAÇÃO DO MOTOR
 * Esta função main contém dois códigos de exemplo para chamar o Motor.
 * (1) O primeiro exemplo é para realizar uma simples partida entre duas classes Jogador.
 * (2) O segundo exemplo realiza múltiplas partidas e contabiliza o número de vitórias de cada classe Jogador.
 *
 * OBS: para alternar entre estes modos basta comentar/descomentar as respectivas linhas que chamam os métodos umaPartida() e multiplasPartidas().
 */

public class Main {

	public static void main(String[] args) {
		// Gera os baralhos com IDs únicos para cada carta de cada Baralho
		Baralho baralho1 = new Baralho(Motor.gerarListaCartasPadrao(0));
		Baralho baralho2 = new Baralho(Motor.gerarListaCartasPadrao(1));
		
		// Determina se o método de embaralhamento dos baralhos será determinístico (true) ou não (false). O modo determinístico pode ajudar na depuração do programa.
		Baralho.setDeterministico(true);
		
		// A verbosidade define se o Motor deve exibir mensagens para cada Jogada feita pelos Jogadores. (0=não mostrar mensagens, 1=mostrar mensagens)
		int verbosidade = 1;
		
		// Rotina que executa uma partida de LaMa
		umaPartida(baralho1, baralho2, verbosidade);
		
		// Rotina que executa múltiplas partidas de LaMa
		//multiplasPartidas(baralho1, baralho2, verbosidade, 10000);
	}
	
	/**
	  * Executa uma única partida de LaMa e diz o vencedor.
	  * 
	  * @param baralho1 Baralho do jogadorA
	  * @param baralho2 Baralho do jogadorB
	  * @param verbosidade Parâmetro do Motor, onde 0=não verboso e 1= verboso.
	  */
	private static void umaPartida(Baralho baralho1, Baralho baralho2, int verbosidade){
		// Embaralha os Baralhos
		baralho1.embaralhar();
		baralho2.embaralhar();
		
		// Declara estruturas que armazenam as cartas da mão
		ArrayList<Carta> Mao1, Mao2;
		Mao1 = new ArrayList<Carta>();
		Mao2 = new ArrayList<Carta>();
		
		// Adiciona cartas à mão de cada jogador com o número de cartas correspondente (para o primeiro Jogador é Motor.cartasIniJogador1 cartas, e para o segundo Jogador é Motor.cartasIniJogador2).
		for(int i = 0; i < Motor.cartasIniJogador1; i++){
			Mao1.add(baralho1.getCartas().get(0));
			baralho1.getCartas().remove(0);
		}
		for(int i = 0; i < Motor.cartasIniJogador2; i++){
			Mao2.add(baralho2.getCartas().get(0));
			baralho2.getCartas().remove(0);
		}
		
		// Inicializa uma cópia para ser enviada ao Jogador das cartas da mão
		@SuppressWarnings("unchecked")
		ArrayList<Carta> mao1clone = (ArrayList<Carta>) UnoptimizedDeepCopy.copy(Mao1);
		@SuppressWarnings("unchecked")
		ArrayList<Carta> mao2clone = (ArrayList<Carta>) UnoptimizedDeepCopy.copy(Mao2);
		
		// Inicializa os Jogadores devidamente (com as cartas da mão e o argumento 'primeiro').
		JogadorAleatorio jogA = new JogadorAleatorio(mao1clone, true);
		JogadorAleatorio jogB = new JogadorAleatorio(mao2clone, false);
		
		// O Motor é construído
		Motor partida = new Motor(baralho1, baralho2, Mao1, Mao2, jogA, jogB, verbosidade);
		
		// Verifica o vencedor da partida
		if(partida.executarPartida())
			System.out.println("A classe jogA venceu!");
		else
			System.out.println("A classe jogB venceu!");
	}
	
	/**
	  * Executa múltiplas partidas de LaMa, sendo metade das partidas com jogadorA como primeiro e jogadorB como segundo,
	  * e a outra metade invertendo-se o esquema (jogadorB como primeiro e jogadorA como segundo).
	  * 
	  * @param baralho1 Baralho do jogadorA
	  * @param baralho2 Baralho do jogadorB
	  * @param verbosidade Parâmetro do Motor, onde 0=não verboso e 1= verboso.
	  * @param n Número de partidas a serem executadas (deve ser um número par).
	  */
	private static void multiplasPartidas(Baralho baralho1, Baralho baralho2, int verbosidade, int n){
		int a = 0, b = 0;
		
		if(n%2 == 1)
			throw new RuntimeException ("Número de múltiplas partidas deve ser um número par (para que seja justo). Número informado: "+n);
		
		boolean moeda = true;
		// São revezadas as partidas com jogA como primeiro e jogB como segundo.
		// E depois partidas com jogB como primeiro e jogA como segundo.
		for(int p = 0; p < 2; p++){
			for(int w = 0; w < n/2; w++){
				// Realiza uma cópia dos Baralhos para uma partida
				Baralho deck1 = (Baralho) UnoptimizedDeepCopy.copy(baralho1);
				Baralho deck2 = (Baralho) UnoptimizedDeepCopy.copy(baralho2);
				
				// Embaralha os Baralhos
				deck1.embaralhar();
				deck2.embaralhar();
				
				// Declara estruturas que armazenam as cartas da mão
				ArrayList<Carta> Mao1, Mao2;
				Mao1 = new ArrayList<Carta>();
				Mao2 = new ArrayList<Carta>();
				
				// Adiciona cartas à mão de cada jogador com o número de cartas correspondente (para o primeiro Jogador é Motor.cartasIniJogador1 cartas, e para o segundo Jogador é Motor.cartasIniJogador2).
				for(int i = 0; i < (moeda?Motor.cartasIniJogador1:Motor.cartasIniJogador2); i++){
					Mao1.add(deck1.getCartas().get(0));
					deck1.getCartas().remove(0);
				}
				for(int i = 0; i < (moeda?Motor.cartasIniJogador2:Motor.cartasIniJogador1); i++){
					Mao2.add(deck2.getCartas().get(0));
					deck2.getCartas().remove(0);
				}
				
				// Inicializa uma cópia para ser enviada ao Jogador das cartas da mão
				@SuppressWarnings("unchecked")
				ArrayList<Carta> mao1clone = (ArrayList<Carta>) UnoptimizedDeepCopy.copy(Mao1);
				@SuppressWarnings("unchecked")
				ArrayList<Carta> mao2clone = (ArrayList<Carta>) UnoptimizedDeepCopy.copy(Mao2);
				
				// Inicializa os Jogadores devidamente (com as cartas da mão e o argumento 'primeiro').
				JogadorAleatorio jogA = new JogadorAleatorio(mao1clone, moeda);
				JogadorAleatorio jogB = new JogadorAleatorio(mao2clone, !moeda);
				
				// O Motor é construído
				Motor partida;
				if(moeda)
					partida = new Motor(deck1, deck2, Mao1, Mao2, jogA, jogB, verbosidade);
				else
					partida = new Motor(deck2, deck1, Mao2, Mao1, jogB, jogA, verbosidade);
				
				// A partida é executada
				boolean vencedor = partida.executarPartida();
				
				// Cria-se um contador para ver qual jogador venceu mais
				if( (moeda && vencedor) || (!moeda && !vencedor) ){
					System.out.println("O jogador A venceu! (classe jogA), que é o "+ (moeda?"primeiro":"segundo") +" jogador desta partida.");
					a++;
				}
				else{
					System.out.println("O jogador B venceu! (classe jogB), que é o "+ (moeda?"segundo":"primeiro") +" jogador desta partida.");
					b++;
				}
			}
			// Muda as posições dos jogadores! O jogador1 passa a ser o segundo e o jogador2 passa a ser o primeiro da partida do LaMa.
			moeda = !moeda;
		}
		
		System.out.println("JogA wins: "+a);
		System.out.println("JogB wins: "+b);
		return;
	}
}

/*  -------- Lista de cartas (criadas em Motor.gerarListaCartasPadrao()) --------------
 * Obs: Cartas do jogadorA possuem IDs < 100 e cartas do jogadorB possuem IDs >= 100.
 * Por exemplo: as duas cartas Gnomo no Baralho do jogadorA serão IDs 0 e 1. As duas cartas Gnomo no Baralho do JogadorB serão IDs 100 e 101.
 * 
 * 																								// [custo de mana] (ataque/vida)
 		Carta c1 = new Carta(player*100+0,    "Gnomo",                TipoCarta.LACAIO, 2, 1, 1, 1); // [1] (2/1)
		Carta c2 = new Carta(player*100+2,    "Recruta",              TipoCarta.LACAIO, 1, 2, 2, 1); // [1] (1/2)
		Carta c3 = new Carta(player*100+4,    "Guerreiro Orc",        TipoCarta.LACAIO, 3, 2, 2, 2); // [2] (3/2)
		Carta c4 = new Carta(player*100+6,    "Guerreiro Espadachim", TipoCarta.LACAIO, 2, 3, 3, 2); // [2] (2/3)
		Carta c5 = new Carta(player*100+8,    "Mestre Orc",           TipoCarta.LACAIO, 4, 2, 2, 3); // [3] (4/2)
		Carta c6 = new Carta(player*100+10,    "Mago Aprendiz",        TipoCarta.LACAIO, 5, 1, 1, 3);// [3] (5/1)
		Carta c7 = new Carta(player*100+12,    "Gigante de Pedra",     TipoCarta.LACAIO, 4, 5, 5, 4); // [4] (4/5)
		Carta c8 = new Carta(player*100+14,    "Gigante de Gelo",      TipoCarta.LACAIO, 5, 4, 4, 4); // [4] (5/4)
		Carta c9 = new Carta(player*100+16,    "Mestre Espadachim",    TipoCarta.LACAIO, 3, 9, 9, 5); // [5] (3/9)
		Carta c10 = new Carta(player*100+18,  "Mestre Mago",          TipoCarta.LACAIO, 7, 2, 2, 5);  // [5] (7/2)
		Carta c11 = new Carta(player*100+20,  "Dragão",               TipoCarta.LACAIO, 7, 7, 7, 7);  // [7] (7/7)
		Carta z1 = new Carta(player*100+22,   "Rajada Congelante",    TipoCarta.MAGIA, TipoMagia.ALVO, 3, 2); // [2] 3 dano no alvo
		Carta z2 = new Carta(player*100+24,   "Raio",                 TipoCarta.MAGIA, TipoMagia.ALVO, 7, 5); // [5] 7 dano no alvo
		Carta z3 = new Carta(player*100+26,   "Onda de Choque",       TipoCarta.MAGIA, TipoMagia.AREA, 1, 2); // [2] 1 dano em area
		Carta z4 = new Carta(player*100+28,   "Mininova",             TipoCarta.MAGIA, TipoMagia.AREA, 3, 5); // [5] 3 dano em area
		
		// Cópia identica das cartas de cima, com IDs ímpares
		Carta c1_2 = new Carta(player*100+1, "Gnomo",                TipoCarta.LACAIO, 2, 1, 1, 1); // [1] (2/1)
		Carta c2_2 = new Carta(player*100+3, "Recruta",              TipoCarta.LACAIO, 1, 2, 2, 1); // [1] (1/2)
		Carta c3_2 = new Carta(player*100+5, "Guerreiro Orc",        TipoCarta.LACAIO, 3, 2, 2, 2); // [2] (3/2)
		Carta c4_2 = new Carta(player*100+7, "Guerreiro Espadachim", TipoCarta.LACAIO, 2, 3, 3, 2); // [2] (2/3)
		Carta c5_2 = new Carta(player*100+9, "Mestre Orc",           TipoCarta.LACAIO, 4, 2, 2, 3); // [3] (4/2)
		Carta c6_2 = new Carta(player*100+11, "Mago Aprendiz",        TipoCarta.LACAIO, 5, 1, 1, 3);// [3] (5/1)
		Carta c7_2 = new Carta(player*100+13, "Gigante de Pedra",     TipoCarta.LACAIO, 4, 5, 5, 4); // [4] (4/5)
		Carta c8_2 = new Carta(player*100+15, "Gigante de Gelo",      TipoCarta.LACAIO, 5, 4, 4, 4); // [4] (5/4)
		Carta c9_2 = new Carta(player*100+17, "Mestre Espadachim",    TipoCarta.LACAIO, 3, 9, 9, 5); // [5] (3/9)
		Carta c10_2 = new Carta(player*100+19,"Mestre Mago",          TipoCarta.LACAIO, 7, 2, 2, 5); // [5] (7/2)
		Carta c11_2 = new Carta(player*100+21,"Dragão",               TipoCarta.LACAIO, 7, 7, 7, 7); // [7] (7/7)
		Carta z1_2 = new Carta(player*100+23, "Rajada Congelante",    TipoCarta.MAGIA, TipoMagia.ALVO, 3, 2); // [2] 3 dano no alvo
		Carta z2_2 = new Carta(player*100+25, "Raio",                 TipoCarta.MAGIA, TipoMagia.ALVO, 7, 5); // [5] 7 dano no alvo
		Carta z3_2 = new Carta(player*100+27, "Onda de Choque",       TipoCarta.MAGIA, TipoMagia.AREA, 1, 2); // [2] 1 dano em area
		Carta z4_2 = new Carta(player*100+29, "Mininova",             TipoCarta.MAGIA, TipoMagia.AREA, 3, 5); // [5] 3 dano em area
*/

