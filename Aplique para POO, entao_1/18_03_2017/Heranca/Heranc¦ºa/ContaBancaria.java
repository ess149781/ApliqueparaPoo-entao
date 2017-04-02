/*
 * ContaBancaria.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */


/**
 *  Esta classe contém a estrutura de implementação de uma Conta Bancária
 */
public class ContaBancaria {
	
    private static int numeroContas=0; 		// variável de classe
	private String nomeCorrentista;			// propriedade nomeCorrentista
  	private double saldo;					// propriedade saldo
  	private int numero;						// propriedade numero da conta
  
	public ContaBancaria() { 
		saldo = 0; 
		numeroContas++; 
	} 
	
	public ContaBancaria(String n,double s) { 
		nomeCorrentista = n; 
		saldo = s;
		numeroContas++; 
	} 
	
	public double getSaldo() { 
		return saldo; 
	} 
	
	public void setSaldo(double s) { 
		saldo = s; 
	} 
	
	public void deposita(double quantia) { 
		saldo = saldo + quantia; 
	} 
	
	public void retira(double quantia) { 
		if (saldo >= quantia) 
			saldo = saldo - quantia; 
	} 
	
	public static int getContas() { 
		return numeroContas; 
	}
}
  
  
  
