/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Elisangela.base;

/**
 *
 * @author Particular
 */
public class CartaLacaio extends Carta{
    private int vidaAtual;
    private int vidaMaxima;
    private int custoMana;
    
   /* public CartaLacaio(int ID, String nome, int ataque, int vida, int vidaMesa, int mana, int magiaDano, int turno) {
        super(ID, nome, ataque, vida, vidaMesa, mana, magiaDano, turno);
    }*/

    public CartaLacaio(int vidaAtual, int vidaMaxima, int custoMana, int ID, String nome, 
                       int ataque, int vida, int vidaMesa, int mana, int magiaDano, int turno) {
        super(ID, nome, ataque, vida, vidaMesa, mana, magiaDano, turno);
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.custoMana = custoMana;
    }

}   
    


