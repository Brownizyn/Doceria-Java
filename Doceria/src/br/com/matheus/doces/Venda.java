package br.com.matheus.doces;

import java.util.ArrayList;
import java.util.List;

import br.com.matheus.IProduto.Produto;

public class Venda {
	private List<Produto> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        for (Produto item : itens) {
            System.out.println(item.getNome() + " - " + item.getDescricao() + ": R$ " + item.getPreco());
        }
    }
}
