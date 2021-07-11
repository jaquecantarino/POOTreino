package entidades;

public class Livro {
	private String nome;
	private String autor;
	private int qtdPaginas;
	private String editora;
	private String genero;
	private double valor;
	private String tipoCapa;
	private boolean livroAberto;
	
	public Livro(String nome, String autor, int qtdPaginas, String editora, String genero, double valor) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.qtdPaginas = qtdPaginas;
		this.editora = editora;
		this.genero = genero;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String getTipoCapa() {
		return tipoCapa;
	}

	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}

	public boolean isLivroAberto() {
		return livroAberto;
	}

	public void abrirLivro() {
		livroAberto=true;
	}
	
	public void fecharLivro() {
		livroAberto=false;
	}
	
	
}
