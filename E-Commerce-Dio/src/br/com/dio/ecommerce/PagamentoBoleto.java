package br.com.dio.ecommerce;

// \strategy

public class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado via boleto.");
    }
}