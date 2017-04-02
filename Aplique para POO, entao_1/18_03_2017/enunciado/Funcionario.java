package Exemplos;

public class Funcionario extends PessoaFisica{
    private String cartao;

    public Funcionario(String cartao, String nome) {
        super(nome);
        this.cartao = cartao;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    
}
