/*
 * ControleRemoto.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a Interface ControleRemoto
 */
public interface ControleRemoto { 
	void mudarCanal(int canal); 
	void aumentarVolume (int valor); 
	void diminuirVolume (int valor); 
	void ligar(); 
	void desligar(); 
}
