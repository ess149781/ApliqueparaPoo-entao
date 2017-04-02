/*
 * Forma.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Solução da classe Forma.java do Lab1 
 */
public class Forma 
{
	private float x;		// coordenada x do centro da Forma
	private float y;		// coordenada y do centro da Forma
	private String nome;
		
	public Forma() {  
		x = y = 0.0f;
		nome = "Forma básica";
    }
	
	public Forma(float x, float y, String nome) {  
		this.x = x;
		this.y = y;
		this.nome = nome;
    }

	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}

	public String getNome() {
		return nome;
	}
	
	public void setX(float x) {
		this.x = x;
	}
    
	public void setY(float y) {
		this.y = y;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float calcArea() {
		return 0.0f;
	}

	/*   @Override   */
	public String toString() {
		String out = ""; 
		out += "Centro da forma "+ getNome()+ ": " + x + "," + y + "\n"; 
		out += "Area da forma: "+ calcArea() + "\n"; 
		return out; 
    }
}