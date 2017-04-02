/*
 * Quadrado.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe Quadrado que implementa a interface AreaCalculavel  e herda de Forma
 */
class Quadrado extends Forma implements AreaCalculavel {	
	private double lado;

	public Quadrado (double lado, double x, double y) {
		super(x,y);
    	this.lado = lado;
		this.setNome("Quadrado");
  	}
	
	public double calculaArea() {
    	return this.lado * this.lado;
  	}
}
