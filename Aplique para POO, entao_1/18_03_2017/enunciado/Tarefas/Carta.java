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
public class Carta {
        private int ID;
	private String nome;
        //private tipo TipoCarta;
	private int ataque;
	private int vida;
        private int vidaMesa;
        private int mana;
        //private MagiaTipo TipoMagia;
        private int magiaDano;
        private int turno;

    public Carta(int ID, String nome, int ataque, int vida, int vidaMesa, int mana, int magiaDano, int turno) {
        this.ID = ID;
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
        this.vidaMesa = vidaMesa;
        this.mana = mana;
        this.magiaDano = magiaDano;
        this.turno = turno;
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMesa() {
        return vidaMesa;
    }

    public void setVidaMesa(int vidaMesa) {
        this.vidaMesa = vidaMesa;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMagiaDano() {
        return magiaDano;
    }

    public void setMagiaDano(int magiaDano) {
        this.magiaDano = magiaDano;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Carta{" + 
                "ID=" + ID + 
                ", nome=" + nome + 
                ", ataque=" + ataque + 
                ", vida=" + vida + 
                ", vidaMesa=" + vidaMesa + 
                ", mana=" + mana + 
                ", magiaDano=" + magiaDano +
                ", turno=" + turno + '}';
    }
        
        
    
}

