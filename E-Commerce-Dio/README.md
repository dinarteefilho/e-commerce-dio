### Padrões de Projeto: E-Commerce Simplificado

Este projeto é uma solução prática para o desafio de explorar e aplicar os conceitos de **Padrões de Projeto** em Java. Ele simula um sistema de e-commerce básico, utilizando três padrões de projeto fundamentais para demonstrar como eles podem organizar e tornar o código mais robusto.

## Padrões de Projeto Utilizados

  - **Singleton:** O `GerenciadorDeEstoque` foi implementado como um Singleton. Isso garante que a aplicação tenha apenas uma única instância do gerenciador, evitando problemas de concorrência e assegurando que todos os módulos acessem o mesmo estado do estoque.

  - **Strategy:** O `PagamentoStrategy` é o núcleo deste padrão. Ele permite que o sistema de checkout mude o método de pagamento dinamicamente (por exemplo, de Cartão de Crédito para Boleto) sem precisar alterar a classe principal.

  - **Facade:** O `ECommerceFacade` age como uma interface unificada e simplificada para o cliente. Ele esconde a complexidade do processo de finalização da compra (que envolve verificar estoque, processar pagamento e enviar notificações), expondo apenas um método simples `finalizarCompra()`.

## Estrutura do Projeto

Para simplificar o desenvolvimento e evitar problemas de compilação, todos os arquivos Java estão no mesmo pacote `br.com.dio.ecommerce` e são organizados da seguinte forma:

```
src/
└── br/
    └── com/
        └── dio/
            └── ecommerce/
                ├── CarrinhoDeCompras.java
                ├── ECommerceFacade.java
                ├── GerenciadorDeEstoque.java
                ├── Main.java
                ├── PagamentoBoleto.java
                ├── PagamentoCartaoCredito.java
                ├── PagamentoStrategy.java
                └── Produto.java
```

## Pré-requisitos

Para executar este projeto, você precisa ter o ambiente de desenvolvimento Java (JDK) instalado em sua máquina.

## Como Executar

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/dinarteefilho/e-commerce-dio.git
    ```

2.  **Abra o projeto:**
    Abra a pasta do projeto em sua IDE de preferência (como VS Code, IntelliJ ou Eclipse).

3.  **Execute a classe `Main`:**
    Rode o método `main()` da classe `br.com.dio.ecommerce.Main` para ver a demonstração do sistema de e-commerce. O console exibirá as etapas da compra e as diferentes estratégias de pagamento em ação.