# Exercício: Sistema de Gerenciamento de Estoque

Crie um programa para gerenciar um estoque de produtos. O sistema deve permitir adicionar produtos, remover produtos, atualizar informações de produtos e listar todos os produtos cadastrados.

A seguir estão os requisitos para o projeto:

1. Crie uma classe chamada "Produto" com os seguintes atributos:
   - Código (String): código único para identificar o produto.
   - Nome (String): nome do produto.
   - Preço (double): preço do produto.

2. Crie um atributo estático chamado "contador" na classe "Produto" para controlar o número de produtos cadastrados. O contador deve ser incrementado toda vez que um novo produto for criado e usado para gerar o código único do produto.

3. Implemente os seguintes métodos na classe "Produto":
   - Construtor: um construtor que recebe o nome, preço e quantidade como parâmetros e atribui um código único ao produto.
   - Getters e setters para todos os atributos.
   - Método "toString()": retorna uma string com as informações do produto formatadas.

4. Crie uma classe chamada "Estoque" para gerenciar os produtos. A classe deve ter os seguintes métodos:
   - Construtor: um construtor que inicializa um array ou uma coleção de produtos vazia.
   - Método "adicionarProduto(Produto produto)": adiciona um produto ao estoque.
   - Método "removerProduto(String codigo)": remove um produto do estoque com base no código.
   - Método "atualizarProduto(String codigo, String nome, double preco)": atualiza as informações de um produto no estoque com base no código.
   - Método "listarProdutos()": lista todos os produtos cadastrados no estoque.

Agora, você deve implementar um programa principal (método `main`) para interagir com o sistema de gerenciamento de estoque. O programa deve permitir ao usuário realizar as seguintes operações:

1. Criar um objeto da classe "Estoque" para gerenciar os produtos.
2. Exibir um menu com as opções:
   - Adicionar um novo produto.
   - Remover um produto existente.
   - Atualizar informações de um produto.
   - Listar todos os produtos cadastrados.
   - Sair do programa.
3. Ler a opção escolhida pelo usuário.
4. Executar a ação correspondente à opção escolhida.
5. Repetir os passos 2 a 4 até que o usuário escolha sair do programa.

Aqui estão algumas diretrizes adicionais para a implementação:

- Para a leitura de dados do usuário, você pode utilizar a classe `Scanner` do Java.
- O programa deve tratar possíveis erros de entrada do usuário, como valores inválidos ou produtos não encontrados.
