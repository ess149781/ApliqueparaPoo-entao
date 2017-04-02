/*
 * TesteFormas.java
 * 
 * Última modificação: 01/10/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *  Classe utilizada para instaciar objetos da classe Quadrado, Retangulo, Circulo que implementam a interface AreaCalculavel
 *  referente a aula de Interfaces
 *  Usa as classes Quadrado.java, Retangulo.java, Circulo.java e AreaCalculavel.java
 */
public class TesteFormas {
	public static void main(String[] args) throws Exception {
		int n,f;
		double p1,p2;
		ArrayList<AreaCalculavel> formas = new ArrayList<AreaCalculavel>();
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);

		do {
			System.out.println("***********************************************************************");
			System.out.print("(1) Criar forma (2) Verificar áreas (3) Sair:\n");
			n = Integer.parseInt(in.readLine());													
			if (n==1) {
				System.out.print("(1) Quadrado (2) Retangulo (3) Circulo:\n");
				f = Integer.parseInt(in.readLine());
				if (f==1) {
					System.out.print("Informe o lado: ");
					p1 = Double.parseDouble(in.readLine());													
					formas.add(new Quadrado(p1));
				} else if (f==2) {
					System.out.print("Informe a base: ");
					p1 = Double.parseDouble(in.readLine());													
					System.out.print("\nInforme a altura: ");
					p2 = Double.parseDouble(in.readLine());													
					formas.add(new Retangulo(p1,p2));
				} else if (f==3) {
					System.out.print("Informe o raio: ");
					p1 = Double.parseDouble(in.readLine());													
					formas.add(new Circulo(p1));
				}				
			} else if (n==2) {
				double soma = 0, area=0;
				for (int i=0; i<formas.size();++i) {
					area = formas.get(i).calculaArea();
					System.out.println("Area do "+ formas.get(i).getClass() + ": " + area);
					soma += area;
				}
				System.out.println("Soma das áreas: " + soma);
			} 
		} while (n!=3);
	}
}
