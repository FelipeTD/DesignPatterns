package example1.proxy1;

public class Proxy1 {

    public static void main(String[] args) {
//        ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutoDAO produtoDAO = new LogProdutoDAO();
        ProdutoService produtoService = new ProdutoService(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }

}
