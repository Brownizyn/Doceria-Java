package br.com.matheus.main;

import br.com.matheus.doces.Chocolate;
import br.com.matheus.doces.Trufa;
import br.com.matheus.doces.Venda;

public class Main {
	public static void main(String[] args) {
        Trufa trufa = new Trufa("Trufa de Morango", 4.50, "Morango");
        Chocolate chocolate = new Chocolate("Chocolate Amargo", 11.00, 70);

        Venda venda = new Venda();
        venda.adicionarItem(trufa);
        venda.adicionarItem(chocolate);

        System.out.println("Itens da venda:");
        venda.exibirItens();

        double total = venda.calcularTotal();
        System.out.println("Total da venda: R$ " + total);
    }
}
