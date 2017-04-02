package Exemplos;

public class PessoaFisica extends Pessoa{
 private String rg;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "rg=" + rg + '}';
    }
    
    
 
}
