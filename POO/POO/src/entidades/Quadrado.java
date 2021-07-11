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
		// podia ser também:
		//return (int) Math.pow(lado,2)
		// esse (int) faz o casting de transformar o double em int, já que o math.pow só calcula double.
		//ou poderia ser:
		//public double area(){
		//return Math.pow(lado,2)
		//}
	}

}
