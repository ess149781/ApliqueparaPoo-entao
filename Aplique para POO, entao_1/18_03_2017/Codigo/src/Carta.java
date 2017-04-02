/**
 * @author fusberti
 *
 */

public class Carta {
	
	private String nome;
	private int ataque;
	private int vida;
	private int mana;
	
	public Carta(String nome, int ataque, int vida, int mana) {
		this.nome = nome;
		this.ataque = ataque;
		this.vida = vida;
		this.mana = mana;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		String out = "";
		out = out + "Nome = "+getNome()+"\n";
		out = out + "Ataque = "+getAtaque()+"\n";
		out = out + "Vida = "+getVida()+"\n";
		out = out + "Custo de Mana = "+getMana()+"\n";
		return out;
		
	}

}