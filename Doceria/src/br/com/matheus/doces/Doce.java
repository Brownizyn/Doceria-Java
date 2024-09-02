package br.com.matheus.doces;

import br.com.matheus.IProduto.Produto;

public abstract class Doce implements Produto{
	private String nome;
	private double preco;
	
	public Doce(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract String getDescricao();
	
}
