package base.cartas.magias;

import java.util.UUID;

import base.cartas.Lacaio;

public class Buff extends Magia {

	private int aumentoEmAtaque;
	private int aumentoEmVida;

    public Buff(UUID id, String nome, int custoMana, int dano,int aumentoEmAtaque, int aumentoEmVida) {
        super(id, nome, custoMana, dano);
        this.aumentoEmAtaque = aumentoEmAtaque;
        this.aumentoEmVida = aumentoEmVida;
    }

    public Buff(String nome, int custoMana, int dano, int aumentoEmAtaque, int aumentoEmVida) {
        this(UUID.randomUUID(), nome, custoMana, dano, aumentoEmAtaque, aumentoEmVida);
        
    }
	public int getAumentoEmAtaque() {
		return aumentoEmAtaque;
	}

	public void setAumentoEmAtaque(int aumentoEmAtaque) {
		this.aumentoEmAtaque = aumentoEmAtaque;
	}

	public int getAumentoEmVida() {
		return aumentoEmVida;
	}

	public void setAumentoEmVida(int aumentoEmVida) {
		this.aumentoEmVida = aumentoEmVida;
	}

	// as variaveis ir�o ser quanto ele aumenta em ataque e quanto aumenta de
	// vida de um lacaio
	public void agir(Lacaio alvo) {
		alvo.setAtaque(alvo.getAtaque() + this.aumentoEmAtaque);
		alvo.setVidaAtual(alvo.getVidaAtual() + this.aumentoEmVida);
		alvo.setVidaMaxima(alvo.getVidaMaxima() + this.aumentoEmVida);
	}

}
