package estoque;

public class Estoque {
  private Produto[] produtos;
  private int capacidadeAtual = 0;
  private int capacidadeTotal;

  public Estoque() {
    this.capacidadeTotal = 100;
    this.produtos = new Produto[this.capacidadeTotal];
  }

  public Estoque(int capacidadeTotal) {
    this.capacidadeTotal = capacidadeTotal;
    this.produtos = new Produto[this.capacidadeTotal];
  }

  private boolean atingiuCapacidadeTotal() {
    if (this.capacidadeAtual < this.capacidadeTotal) {
      return true;
    } else {
      return false;
    }
  }

  public boolean adicionarProduto(Produto produto) {
    if (this.atingiuCapacidadeTotal()) {
      this.produtos[this.capacidadeAtual] = produto;
      this.capacidadeAtual++;
      return true;
    } else {
      return false;
    }
  }

  private int existeProduto(String codigo) {
    for (int i = 0; i < this.capacidadeAtual; i++) {
      if (this.produtos[i].getCodigo().equalsIgnoreCase(codigo)) {
        return i;
      }
    }

    return -1;
  }

  public boolean removerProduto(String codigo) {
    int posicaoProduto = this.existeProduto(codigo);
    if (posicaoProduto != -1) {
      this.produtos[posicaoProduto] = null;

      for (int i = posicaoProduto; i < this.capacidadeAtual; i++) {
        this.produtos[i] = this.produtos[i + 1];
      }

      this.produtos[this.capacidadeAtual - 1] = null;
      this.capacidadeAtual--;
      return true;
    }

    return false;
  }

  public boolean atualizarProduto(String codigo, String nome, double preco) {
    int posicaoProduto = this.existeProduto(codigo);

    if (posicaoProduto == -1) {
      return false;
    }

    this.produtos[posicaoProduto].setNome(nome);
    this.produtos[posicaoProduto].setPreco(preco);
    return true;
  }

  public void listarProdutos() {
    for (int i = 0; i < this.capacidadeAtual; i++) {
      System.out.println(this.produtos[i]);
      System.out.println("------------------------");
    }
  }

}
