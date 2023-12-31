package lab03;

import javax.persistence.*;

@Entity
@Table
public class Carrinho {
    @Id
    @Column
    private int id;
    @Column
    private String nome_produto;
    @Column
    private int quantidade;
    @Column
    private double preco;

    public Carrinho() {
    }

    public Carrinho(int id, String nome_produto, int quantidade, double preco) {
        this.setId(id);
        this.setNome_produto(nome_produto);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "id=" + id +
                ", nome_produto='" + nome_produto + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
