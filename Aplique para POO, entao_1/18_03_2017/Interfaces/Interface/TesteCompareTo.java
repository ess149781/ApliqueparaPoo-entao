/*
 * TesteCompareTo.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *  Classe utilizada para testar a interface Comparable
 */
public class TesteCompareTo {
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta(3,"Darth Vader"));
		contas.add(new Conta(1,"Princesa Léia"));
		contas.add(new Conta(4,"Han Solo"));
		contas.add(new Conta(2,"Chewbacca"));
		System.out.println("***********************************************************************");
		System.out.println("**************************** Antes de ordenar *************************");
		for (int i=0; i<contas.size(); ++i)
		{
			System.out.println(contas.get(i));
		}
		Collections.sort(contas);		
		System.out.println("**************************** Depois de ordenar *************************");
		for (int i=0; i<contas.size(); ++i)
		{
			System.out.println(contas.get(i));
		}
	}
}
