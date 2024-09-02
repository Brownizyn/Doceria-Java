package br.com.matheus.doces;

public class Chocolate extends Doce{
	private int porcentagemCacau;

	public Chocolate(String nome, double preco, int porcentagemCacau) {
		super(nome, preco);
		this.porcentagemCacau = porcentagemCacau;
	}

	public int getPorcentagemCacau() {
		return porcentagemCacau;
	}

	public void setPorcentagemCacau(int porcentagemCacau) {
		this.porcentagemCacau = porcentagemCacau;
	}

	@Override
	public String getDescricao() {
		return "Chocolate com " + porcentagemCacau + "% de Cacau";
	}
	
	
}
