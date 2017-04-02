/*
 * Retangulo.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe Retangulo que implementa a interface AreaCalculavel
 */
class Retangulo implements AreaCalculavel {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
    	this.largura = largura;
    	this.altura = altura;
  	}

  	public double calculaArea() {
    	return this.largura * this.altura;
  	}
}
