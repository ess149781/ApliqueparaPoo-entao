/*
 * Retangulo.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe Retangulo que implementa a interface AreaCalculavel e herda de Forma
 */
class Retangulo extends Forma implements AreaCalculavel {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura, double x, double y) {
		super(x,y);
    	this.largura = largura;
    	this.altura = altura;
		this.setNome("Retangulo");
  	}

  	public double calculaArea() {
    	return this.largura * this.altura;
  	}
}
