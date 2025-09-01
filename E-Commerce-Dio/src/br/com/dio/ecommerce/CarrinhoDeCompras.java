package br.com.dio.ecommerce;

import java.util.ArrayList;
import java.util.List;

// \model

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double getValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}