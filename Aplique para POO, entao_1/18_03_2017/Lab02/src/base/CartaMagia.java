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
public class CartaMagia {
    private int ID;
    //private String nome;
    public String nome;
    private int dano;
    private boolean area;
    private int custoMana;

    public CartaMagia(int ID, String nome, int dano, boolean area, int custoMana) {
        this.ID = ID;
        this.nome = nome;
        this.dano = dano;
        this.area = area;
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

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean isArea() {
        return area;
    }

    public void setArea(boolean area) {
        this.area = area;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }

    /*
    @Override
    public String toString() {
        return "CartaMagia{" + "ID=" + ID +
                ", nome=" + nome + 
                ", dano=" + dano + 
                ", area=" + area + 
                ", custoMana=" + custoMana + '}';
    }
 */   
    
}
