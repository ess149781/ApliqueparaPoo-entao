public class Conta implements Comparable<Conta> {
         
    private int numero;
    private String titular;
    // outros metodos e atributos
 	
 	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
 	}
	
    public int compareTo(Conta outraConta) {
        if (this.numero < outraConta.numero) {
            return -1;
        }
        if (this.numero > outraConta.numero) {
            return 1;
        }
        return 0;
    }
	
	public String toString() {
		String out = "";
		out += "Conta de " + titular + " tem numero " + numero;
		return out;
	}
}
