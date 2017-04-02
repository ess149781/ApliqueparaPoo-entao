/*
 * TesteForma.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */


/**
 *  Classe utilizada para instaciar objetos da classe Forma, Retangulo e Triangulo
 *  Utiliza Retangulo.java, Triangulo.java e Forma.java
 */
public class TesteForma {
	public static void main(String args[]) {
		
	    Forma basica = new Forma();
	    System.out.println(basica);
		   
	    System.out.println("******************************************* ");
	    Retangulo r1 = new Retangulo(3.5f,2.5f,1f,1f,"Retangulo");
	    System.out.println(r1);
		
	    System.out.println("******************************************* ");
	    Triangulo t1 = new Triangulo(5,5,2,2,"Triangulo");
	    System.out.println(t1);
	}
}

