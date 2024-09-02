package br.com.matheus.doces;

public class Trufa extends Doce{
	private String sabor;

	public Trufa(String nome, double preco, String sabor) {
		super(nome, preco);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String getDescricao() {
		return "Trufa Sabor" + sabor;
	}
	
	
	
}
