
import base.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Particular
 */
public class Main {
    public static void main(String[] args) {
        //instanciando os objetos
     CartaLacaio  lac1 = new CartaLacaio(1,"Frodo Bolseiro",2,1,1,1);  
     CartaLacaio  lac2 = new CartaLacaio(2,"Aragorn",5,7,6,1);  
     CartaLacaio  lac3 = new CartaLacaio(3,"Legolas",8,4,6,1); 
     CartaMagia mag1 = new CartaMagia(4,"You shall not pass",4,true,7);
     CartaMagia mag2 = new CartaMagia(5,"Telecinese",3,false,2);
     
     /*Adicione também um objeto do tipo CartaLacaio com o nome de lac4 utilizando
     o novo construtor adicionado a classe */
     System.out.println("\n Tarefa 1:");
     CartaLacaio lac4 = new CartaLacaio (4,"Gandalf",8);
     System.out.println("Quarto lacaio: \n"+lac4); 
     
     /*Altere o ataque do lac1. faça com que ele receba o ataque 
     do objeto lac3. Imprima o lac1*/
     System.out.println("\n Tarefa 2:");
     lac1.setAtaque(lac3.getAtaque());
     System.out.println("Primeiro lacaio: \n"+lac1); 
     
     /* O que acontece se o método toString() não for sobrescrito
     na classe Cartamagia e for executado o comendo de impressão?
     (comente o método na classe e veja o que acontece)
     */
     System.out.println("\n Tarefa 3:");
     System.out.println("Primeira Magia: \n"+mag1);
     
     /*Instancie um novo objeto lac5 utilizando o construtor de cópia 
     com o objeto lac2 como entrada de parâmetro. Imprima lac2 e lac5. Há alguma
     diferença entre esses dois objetos?*/
     System.out.println("\n Tarefa 4:");
     CartaLacaio  lac5 = new CartaLacaio(lac2.getID(),lac2.getNome(),lac2.getCustoMana());  
     System.out.println("Primeiro lacaio: \n"+lac2); 
     System.out.println("Quinto lacaio: \n"+lac5); 
     
     /*Altere a visibilidade do atributo nome na classe CartaMagia
     para public. Execute os comandos a seguir na classe main.
           
     Tente fazer o mesmo sem alterar a visibilidade do atributo
     nome de um Objeto de CartaLacaio. O que acontece e por que?
     Qual o objetivo de utilizarmos atributos privados e os métodos
     get() e set() para cada atributo?
     */
     System.out.println("\n Tarefa 5:");
     System.out.println(mag1.nome);
     System.out.println(mag1.getNome());
     
     /* Crie na Cartalacaio dois métodos buffar que irão deixar a carta da classe mais forte. O primeiro método 
     deve receber um inteiro que representa o quanto irá se fortalece(void buffar(int a)). A função deve
     "buffar" a Carta somando o inteiro a seu ataque e sua vida.O segundo método deve receber dois inteiros, um 
     que irá somar o ataque e outro que irá somar a vida da carta(void buffar(int a, int v)), Além disso, os métodos
     devem alterar o nome da carta da seguinte forma: nomeAnterior + " Fortalecido", que pode ser um terceiro método 
     "void alteraNomeFortalecido()". verifique se os parâmetros passados      irão relamente "buffar" a carta antes 
     de efetuar a operação, caso contrário, não faça nenhuma alteração. Por exemplo, o método buffar92) aumentaria em 
     +2 o ataque e a vida do lacaio e deixaria o nome com o sufixo Fortalecido. Aumente o ataque de uma carta em 5 com 
     o primeiro método. Utilize o segundo método em outra carta e aumente o ataque em 4 e a vida em 5. Imprima as cartas 
     fortalecidas. 
    */ 
                 System.out.println("\n Tarefa 5:"); 
                 lac2.buffar(5);
		 System.out.println("Segundo lacaio:\n"+lac2);
		 lac3.buffar(4, 5);
		 System.out.println("Terceiro lacaio:\n"+lac3);    
     }
}
