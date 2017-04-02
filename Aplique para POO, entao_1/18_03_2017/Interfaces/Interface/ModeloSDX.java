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

public class ModeloSDX extends TV implements ControleRemoto {
	public final String MODELO = "TV-SDX";
    
	public ModeloSDX(int tamanho) {
		super(tamanho);
    }
	
    public void desligar() {
        System.out.println("Tchau!");
        super.setLigada(false);
    }
	
    public void ligar() {
        super.setLigada(true);
    }
	
//	public void aumentarVolume (int valor) { }
//	public void diminuirVolume (int valor) { } 
//  public void mudarCanal(int canal) { }
}
