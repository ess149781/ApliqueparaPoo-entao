/*
 * ContaPoupanca.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */


/**
 *  Esta classe contém a estrutura de implementação de uma Conta Poupança
 *  Herda de ContaBancaria.java
 */
public class ContaPoupanca extends ContaBancaria
{
	private double jurosAoMes;		// propriedade juros ao mês
	
	public ContaPoupanca(String n,double s,double j) {
		super(n,s);
		jurosAoMes = j;
	}
	
	public void atualiza() {
		double valor = getSaldo()*(jurosAoMes/100);
		deposita(valor);
	}
}

