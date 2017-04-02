/*
 * ClasseImplementaDoIt.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Classe que implementa a Interface DoIt
 */
public class ClasseImplementaDoIt implements DoIt {
	private String minhaVariavel;
	
	public ClasseImplementaDoIt(String minhaVariavel) {
		this.minhaVariavel = minhaVariavel;
	}
	
	public int doSomething(int i, int j) {
		return x+y;
	}

   	public int doSomethingElse(String s) {
        System.out.println(s);
   		
   	}

  	public boolean didItWork() {
         System.out.println("Não tenho a menor ideia... Agora estou na classe!!!");
		 return true;
	}
}
