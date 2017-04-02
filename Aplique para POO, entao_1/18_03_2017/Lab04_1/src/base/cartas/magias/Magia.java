package base.cartas.magias;



import base.cartas.Carta;
import base.cartas.Lacaio;
import java.util.List;
import java.util.UUID;

public  class Magia extends Carta {

     private int dano;

    public Magia( UUID id, String nome, int custoMana, int dano) {
        super(id, nome, custoMana);
        this.dano = dano;
    }

    public Magia( String nome, int custoMana, int dano) {
        this(UUID.randomUUID(), nome, custoMana, dano);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
      
        
        // Magia de dado , ele danificar um alvo
	// Magia de Dano atacando um Lacaio
	// precisa dimnuir a vida
	public void agir(Lacaio alvo) {
		alvo.setVidaAtual(alvo.getVidaAtual() - this.getDano());

	}
        // Dano de area precisa de uma lista de inimigos
	public void agir(List<Lacaio> alvos) {
		for (Lacaio alvo : alvos) {
			this.agir(alvo);
		}
	}
	
}