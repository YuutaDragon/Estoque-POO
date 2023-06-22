package estoque;

public class Produto {
  private String codigo;
  private String nome;
  private double preco;

  private static int id = 0;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;

    this.codigo = "ID" + id++;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getCodigo() {
    return codigo;
  }

  @Override
  public String toString() {
    return "Código: " + codigo + "\nNome: " + nome + "\nPreço: " + preco;
  }
}
