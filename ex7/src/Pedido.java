import java.util.ArrayList;
import java.util.List;

class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

}

public class Pedido {
    private List<Produto> produtos;

    public Pedido(){
        this.produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public double calcularTotal(){
        double total = 0;
        for(Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }

    public void listarProdutos(){
        System.out.println("Produtos no pedido: ");
        for (Produto produto : produtos){
            System.out.println("- " + produto.getNome() +  " (R$ " + produto.getPreco() + ")");
        }
    }
}
