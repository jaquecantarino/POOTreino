package programa;

import entidades.Livro;

public class ProgramaLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Extraordinario", "Raquel Jaramillo", 310, "Intrínseca", "Infantil", 39.90);

		System.out.println("Autor: "+livro1.getAutor()+"\tLivro: "+livro1.getAutor());
		System.out.println("Páginas: "+ livro1.getQtdPaginas()+"\tEditora: "+livro1.getEditora()+"\tGenero: "+livro1.getGenero());
		System.out.println("Valor: "+livro1.getValor());
		
		livro1.abrirLivro();
		System.out.println("Livro está aberto? "+livro1.isLivroAberto());
		
		
	}

}
