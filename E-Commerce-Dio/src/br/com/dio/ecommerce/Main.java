package br.com.dio.ecommerce;

public class Main {
    public static void main(String[] args) {
        
        ECommerceFacade fachada = new ECommerceFacade();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        Produto livro = new Produto("Livro de Design Patterns", 75.0);
        Produto mouse = new Produto("Mouse Gamer", 150.0);
        
        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(mouse);

        fachada.setPagamentoStrategy(new PagamentoCartaoCredito());
        fachada.finalizarCompra(carrinho);

        System.out.println("\n--- Trocando a estratégia de pagamento ---");
        
        fachada.setPagamentoStrategy(new PagamentoBoleto());
        fachada.finalizarCompra(carrinho);
    }
}