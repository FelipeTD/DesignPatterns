package example1.proxy2;

public class Proxy2 {

    public static void main(String[] args) {
//                ProdutoDAO2 produtoDAO = new ProdutoDAO2();
        ProdutoDAO2 produtoDAO = new CacheProdutoDAO2();
        ProdutoService2 produtoService = new ProdutoService2(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);
    }

}
