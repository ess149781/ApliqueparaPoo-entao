/*
 * TV.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe TV
 */
public class TV { 
	private int tamanho; 
	private int canal; 
	private int volume; 
	private boolean ligada; 
	
	public TV(int tamanho) { 
		this.tamanho = tamanho; 
    	this.canal = 0; 
    	this.volume = 0;
    	this.ligada = false; 
	} 
  	// Abaixo teríamos todos os métodos construtores gets e sets 
	
	public boolean estaLigada() {
		return ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
}
