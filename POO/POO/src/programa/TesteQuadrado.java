package programa;

import java.util.Scanner;

import entidades.Quadrado;

public class TesteQuadrado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Quadrado quadrado = new Quadrado(0);
		int lado;
		
		System.out.println("Qual o lado do quadrado?");
		lado = leia.nextInt();
		quadrado.setLado(lado);
		System.out.println("A area do quadrado é: "+quadrado.area());

	}

}
