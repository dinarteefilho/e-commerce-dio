package br.com.dio.ecommerce;

// \strategy

public class PagamentoCartaoCredito implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com cartão de crédito.");
    }
}