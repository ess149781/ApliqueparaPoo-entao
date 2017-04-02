import java.util.ArrayList;
import java.util.Random;

// ATENÇÃO: Renomeie este arquivo e a classe, substituindo "xxxxxx" pelo RA do aluno. Linhas 10, 21 e 29.

/**
* Esta classe representa um Jogador para o jogo LaMa (Lacaios & Magias).
* @author Nome do Aluno Aqui
*/
public class JogadorRAxxxxxx extends Jogador {
	public ArrayList<Carta> lacaios;
	public ArrayList<Carta> lacaiosOponente;
	
	/**
	  * O método construtor do JogadorRAxxxxxx.
	  * 
	  * @param maoInicial Contém a mão inicial do jogador. Deve conter o número de cartas correto dependendo se esta classe Jogador que está sendo construída é o primeiro ou o segundo jogador da partida. 
	  * @param primeiro   Informa se esta classe Jogador que está sendo construída é o primeiro jogador a iniciar nesta jogada (true) ou se é o segundo jogador (false).
	  * @return            um objeto JogadorAleatorio
	  */
	public JogadorRAxxxxxx(ArrayList<Carta> maoInicial, boolean primeiro){
		primeiroJogador = primeiro;
		
		mao = maoInicial;
		lacaios = new ArrayList<Carta>();
		lacaiosOponente = new ArrayList<Carta>();
		
		// Mensagens de depuração:
		System.out.println("Sou o " + (primeiro?"primeiro":"segundo") + " jogador (classe: JogadorRAxxxxxx)");
		System.out.println("Mao inicial:");
		for(int i = 0; i < mao.size(); i++)
			System.out.println("ID " + mao.get(i).getID() + ": " + mao.get(i));
	}
	
	/**
	  * Um método que processa o turno de cada jogador. Este método deve retornar as jogadas do Jogador correspondente para o turno atual (ArrayList de Jogada).
	  * 
	  * @param mesa   O "estado do jogo" imediatamente antes do início do turno corrente. Este objeto de mesa contém todas as informações 'públicas' do jogo (lacaios vivos e suas vidas, vida dos heróis, etc).
	  * @param cartaComprada   A carta que o Jogador recebeu neste turno (comprada do Baralho). Obs: pode ser null se o Baralho estiver vazio ou o Jogador possuir mais de 10 cartas na mão.
	  * @param jogadasOponente   Um ArrayList de Jogada que foram os movimentos utilizados pelo oponente no último turno, em ordem.
	  * @return            um ArrayList com as Jogadas decididas
	  */
	public ArrayList<Jogada> processarTurno (Mesa mesa, Carta cartaComprada, ArrayList<Jogada> jogadasOponente){
		int minhaMana;
		if(cartaComprada != null)
			mao.add(cartaComprada);
		if(primeiroJogador){
			minhaMana = mesa.getManaJog1();
			lacaios = mesa.getLacaiosJog1();
			lacaiosOponente = mesa.getLacaiosJog2();
		}
		else{
			minhaMana = mesa.getManaJog2();
			lacaios = mesa.getLacaiosJog2();
			lacaiosOponente = mesa.getLacaiosJog1();
		}
		
		ArrayList<Jogada> minhasJogadas = new ArrayList<Jogada>();
		// Aqui analisa e escolhe as jogadas
		return minhasJogadas;
	}
}
