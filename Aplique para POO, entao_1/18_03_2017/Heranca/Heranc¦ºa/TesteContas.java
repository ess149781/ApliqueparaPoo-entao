/*
 * TesteContas.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */


/**
 *  Classe utilizada para instaciar objetos da classe ContaBancaria, ContaPoupanca e ContaEspecial
 *  Utiliza ContaBancaria.java, ContaEspecial.java e ContaPoupanca.java
 */
public class TesteContas {
	public static void main(String args[]) {
		
	    ContaBancaria minha = new ContaBancaria("Eu",200);
	    System.out.println("Saldo inicial da minha conta: " + minha.getSaldo());
	    minha.retira(120);
	    minha.retira(100);
	    System.out.println("Saldo da minha conta: " + minha.getSaldo());
		   
	    System.out.println("******************************************* ");
	    ContaEspecial bill = new ContaEspecial("Bill",10000,2000);
	    System.out.println("Saldo inicial da conta do Bill: " + bill.getSaldo()); 	// -1000
	    bill.retira(5000);
	    bill.retira(6000);
	    System.out.println("Saldo da conta do Bill: " + bill.getSaldo()); 			// -1000
	    bill.retira(2000);
	    System.out.println("Saldo da conta do Bill: " + bill.getSaldo()); 			// -1000
		
	    System.out.println("******************************************* ");
		ContaPoupanca cp = new ContaPoupanca("Poupador",1000,2);
	    System.out.println("Saldo inicial: " + cp.getSaldo()); 
		cp.atualiza(); 																// mais 20: 1020
	    System.out.println("Saldo atual (depois do atualiza): " + cp.getSaldo()); 
		cp.deposita(100); 															// mais 100: 1120
	    System.out.println("Saldo atual (depois do deposita): " + cp.getSaldo()); 
		cp.atualiza(); 																// mais 22.40: 1142.40
	    System.out.println("Saldo atual (depois do atualiza): " + cp.getSaldo()); 
		cp.retira(100); 															// menos 100: 1042.40
	    System.out.println("Saldo atual (depois do retira): " + cp.getSaldo()); 
	}
}

