/*
 * ModeloTV001.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a Classe ModeloTV001 que herda de TV e implementa a itnerface ControleRemoto
 */
public class ModeloTV001 extends TV implements ControleRemoto {
    public final String MODELO = "TV001"; 	// Constante

    public ModeloTV001(int tamanho) {
        super(tamanho);
    }
	
    public void desligar() {
        super.setLigada(false);
    }
	
    public void ligar() {
        System.out.println("Olá!");
        super.setLigada(true);
    }
	
	public void aumentarVolume (int valor) { }
	public void diminuirVolume (int valor) { } 
    public void mudarCanal(int canal) { }
}
