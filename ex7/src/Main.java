public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Telefone", 2100.00);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.listarProdutos();
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}