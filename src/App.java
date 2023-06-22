import java.util.Scanner;

import estoque.Estoque;
import estoque.Produto;

public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, preco);
                    estoque.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o código do produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();
                    if (estoque.removerProduto(codigoRemover)) {
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o código do produto a ser atualizado: ");
                    String codigoAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    estoque.atualizarProduto(codigoAtualizar, novoNome, novoPreco);
                    System.out.println("Produto atualizado com sucesso.");
                    break;
                case 4:
                    System.out.println();
                    estoque.listarProdutos();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
