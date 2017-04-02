/*
 * Retangulo.java
 * 
 * Última modificação: 20/08/2016 
 * 
 * Material utilizado na disciplina MC322 - Programação Orientada a Objetos
 */

/**
 *  Solução da classe Retangulo.java do Lab1 -> herda de Forma
 */
public class Retangulo extends Forma
{
	private float base;			// base do retangulo
	private float altura;		// altura do retangulo
		
	public Retangulo() {  
		super();
		base = altura = 0.0f;
		setNome("Retangulo");
    }
	
	public Retangulo(float base, float altura, float x, float y, String nome) {  
		super(x,y,nome);
		this.base = base;
		this.altura = altura;
    }

	public float getBase() {
		return base;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
    
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/*   @Override   */
	public float calcArea() {
		return base*altura;
	}

	/*   @Override   */
	public String toString() {
		String out = ""; 
		out += super.toString(); 
		out += "Base: "+ base + " altura:" + altura + "\n"; 
		return out; 
    }
}