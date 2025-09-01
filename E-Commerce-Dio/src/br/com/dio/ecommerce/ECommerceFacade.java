package br.com.dio.ecommerce;

// \facade

public class ECommerceFacade {

    private GerenciadorDeEstoque estoque;
    private PagamentoStrategy pagamento;

    public ECommerceFacade() {
        this.estoque = GerenciadorDeEstoque.getInstancia();
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(CarrinhoDeCompras carrinho) {
        double valorTotal = carrinho.getValorTotal();
        
        System.out.println("\nIniciando a finalização da compra...");

        for (Produto produto : carrinho.getProdutos()) {
            if (!estoque.verificarDisponibilidade(produto, 1)) {
                System.out.println("Produto " + produto.getNome() + " fora de estoque.");
                return;
            }
        }
        
        pagamento.pagar(valorTotal);
        System.out.println("Notificação de compra enviada ao cliente.");
        System.out.println("Compra finalizada com sucesso!");
    }
}