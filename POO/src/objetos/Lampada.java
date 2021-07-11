package objetos;

public class Lampada {
	
	private String tipo;
	private double preco;
	private String qualidade;
	private String cor;
	private int consumo;
	private boolean ligado;
	private int estoque;
	
	public Lampada(String tipo, double preco, String qualidade, String cor, int consumo) {
		super();
		this.tipo = tipo;
		this.preco = preco;
		this.qualidade = qualidade;
		this.cor = cor;
		this.consumo = consumo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void ligar() {
		ligado=true;
		System.out.println("Ligando lampada.");
	}
	
	public void desligar() {
		ligado=false;
		System.out.println("Desligando lampada.");
	}
	
	public void atualizaEstoque(int estoque) {
		this.estoque=estoque;
	}
	
	public void vender(int qtdVendida) {
		estoque = estoque - qtdVendida;
	}
	
	
	

}
