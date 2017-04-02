/*
 * ExemploInterface.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Classe utilizada para instaciar objetos da classe ModeloTV001, ModeloSDX
 *  Usa as classes ModeloTV001.java, ModeloSDX.java, TV.java e ControleRemoto.java
 */
public class ExemploInterface {
	public static void main(String[] args) {
		ModeloTV001 tv1 = new ModeloTV001(21);
        ModeloSDX tv2 = new ModeloSDX (42);
        tv1.ligar();
        tv2.ligar();
        System.out.print("TV1 - modelo " + tv1.MODELO + " está ");
        System.out.println(tv1.estaLigada() ? "ligada" : "desligada");
        System.out.print("TV2 - modelo " + tv2.MODELO + " está ");
        System.out.println(tv1.estaLigada() ? "ligada" : "desligada");
        // ambas as TVs estão ligadas e vamos desligá-las
        System.out.println("Desligando modelo " + tv1.MODELO);
        tv1.desligar();
        System.out.println("Desligando modelo " + tv2.MODELO);
        tv2.desligar();
    }
}
