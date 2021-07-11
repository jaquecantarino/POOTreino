package entidades;

public class Quadrado {
	private int lado;

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int area() {
		return lado * lado;
		// podia ser tamb�m:
		//return (int) Math.pow(lado,2)
		// esse (int) faz o casting de transformar o double em int, j� que o math.pow s� calcula double.
		//ou poderia ser:
		//public double area(){
		//return Math.pow(lado,2)
		//}
	}

}
