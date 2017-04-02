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
public class CartaMagia extends Carta{
        private int dano;
	private boolean area;
	private int custoMana;

    public CartaMagia(int dano, boolean area, int custoMana, 
                      int ID, String nome, int ataque, int vida, int vidaMesa, int mana, int magiaDano, int turno) {
        super(ID, nome, ataque, vida, vidaMesa, mana, magiaDano, turno);
        this.dano = dano;
        this.area = area;
        this.custoMana = custoMana;
    }
        
	
    
}
