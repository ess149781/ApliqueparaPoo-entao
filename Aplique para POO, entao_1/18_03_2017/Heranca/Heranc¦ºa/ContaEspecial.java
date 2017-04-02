/*
 * ContaEspecial.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */


/**
 *  Esta classe contém a estrutura de implementação de uma Conta Especial
 *  Herda de ContaBancaria.java
 */
public class ContaEspecial extends ContaBancaria
{
	private double limite;		// propriedade limite
	
	public ContaEspecial() {
		super();
		limite = 0;
	}
	
	public ContaEspecial(String n, double s, double l) {
		super(n,s);
		limite = l;
		deposita(limite); // Simula o dinheiro a mais do limite!
	}
	
	// Método sobrescrito
	public double getSaldo() {  
		return super.getSaldo()-limite;
	}
}
  
  
  
