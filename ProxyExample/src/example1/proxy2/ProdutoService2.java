package example1.proxy2;

public class ProdutoService2 {

    private ProdutoDAO2 produtoDAO;

    public ProdutoService2(ProdutoDAO2 produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id);
    }

}
