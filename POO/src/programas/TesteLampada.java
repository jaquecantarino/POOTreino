package programas;

import objetos.Lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada("Led", 7.99, "PrimeiraLinha", "Branca", 20);
				
		System.out.println("Lampada: "+lamp1.getTipo()+"\t"+lamp1.getQualidade());
		System.out.println("Cor: "+lamp1.getCor()+"\tWatts: "+lamp1.getConsumo());
		System.out.println("Valor: "+lamp1.getPreco());
		lamp1.atualizaEstoque(5);
		System.out.println("Estoque: "+lamp1.getEstoque());
		lamp1.vender(3);
		System.out.println("Estoque: "+lamp1.getEstoque());
	}

}
