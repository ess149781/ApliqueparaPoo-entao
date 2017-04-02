/*
 * TesteMetodoEstaticoInterface.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Classe utilizada para instanciar objetos da ClasseImplementaDoIt e da Interface DoIt
 */
public class TesteMetodoEstaticoInterface {
	public static void main(String[] args) {

		ClasseImplementaDoIt teste = new ClasseImplementaDoIt("Teste da classe");
		System.out.println("Chamando o metodo doSomething" +teste.doSomething(2,3));
		teste.doSomethingElse("Oi...");
		System.out.println("Funcionou? " + teste.didItWork());
		System.out.println("Chamando o método da classe, definido na Interface");
		DoIt.didItWork();
		
    }
}
