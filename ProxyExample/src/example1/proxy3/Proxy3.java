package example1.proxy3;

public class Proxy3 {

    public static void main(String[] args) {
//              IProdutoDAO3 produtoDAO = new ProdutoDAO3();
        IProdutoDAO3 produtoDAO = new LazyProdutoDAO3();
        ProdutoService3 produtoService = new ProdutoService3(produtoDAO);
        System.out.println("Produto service criado.");
//        produtoService.buscarProduto(1);
//        produtoService.buscarProduto(2);
//        produtoService.buscarProduto(3);
    }

}
