/*
 * Quadrado.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe Quadrado que implementa a interface AreaCalculavel
 */
class Quadrado implements AreaCalculavel {	
	private double lado;

	public Quadrado (double lado) {
    	this.lado = lado;
  	}
	
	public double calculaArea() {
    	return this.lado * this.lado;
  	}
}