/*
 * Forma.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Define a classe Forma 
 */
class Forma {
	private double x;
	private double y;
	private String nome;

	public Forma(double x, double y) {
    	this.x = x;
    	this.y = y;
  	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}


