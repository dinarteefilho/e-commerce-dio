package br.com.dio.ecommerce;

// \singleton

public class GerenciadorDeEstoque {

    private static GerenciadorDeEstoque instancia;

    private GerenciadorDeEstoque() {}

    public static GerenciadorDeEstoque getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeEstoque();
        }
        return instancia;
    }

    public boolean verificarDisponibilidade(Produto produto, int quantidade) {
        System.out.println("Verificando disponibilidade do produto: " + produto.getNome());
        return true; 
    }
}