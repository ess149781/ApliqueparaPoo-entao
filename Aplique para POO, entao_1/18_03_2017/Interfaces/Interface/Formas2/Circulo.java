/*
 * Circulo.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */
import java.lang.Math;
/**
 *  Define a classe Circulo que implementa a interface AreaCalculavel e herda de Forma
 */
class Circulo extends Forma implements AreaCalculavel {
	private double raio;
	private final double PI = 3.1415;

	public Circulo(double raio, double x, double y) {
		super(x,y);
    	this.raio = raio;
		this.setNome("Circulo");
  	}

  	public double calculaArea() {
    	return Math.pow(this.raio,2.0) * PI;
  	}

}

