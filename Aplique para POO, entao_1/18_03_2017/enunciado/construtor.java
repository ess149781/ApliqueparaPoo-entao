public CartaLacaio(int vidaAtual, int vidaMaxima, int custoMana, int ID, String nome, 
                       int ataque, int vida, int vidaMesa, int mana, int magiaDano, int turno) {
        super(ID, nome, ataque, vida, vidaMesa, mana, magiaDano, turno);
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.custoMana = custoMana;
    }