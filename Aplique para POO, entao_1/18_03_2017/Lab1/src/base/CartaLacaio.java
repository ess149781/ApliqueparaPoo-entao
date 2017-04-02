/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Particular
 */
public class CartaLacaio {
   private int ID ;
   private String nome  ;   
   private int ataque,vidaAtual,vidaMaxima,custoMana;
   //private int vidaAtual;
   //private int vidaMaxima;
   //private int custoMana;   

    public CartaLacaio(int ID, String nome, int ataque, int vidaAtual, int vidaMaxima, int custoMana) {
        this.ID = ID;
        this.nome = nome;
        this.ataque = ataque;
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.custoMana = custoMana;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }

    @Override
    public String toString() {
        return "CartaLacaio{" + "ID=" + ID + 
                ", nome=" + nome +
                ", ataque=" + ataque + 
                ", vidaAtual=" + vidaAtual + 
                ", vidaMaxima=" + vidaMaxima + 
                ", custoMana=" + custoMana + '}';
    }

    
   
   
}
