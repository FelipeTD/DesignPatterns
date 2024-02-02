package example1.proxy1;

public class ProdutoService {

    private ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id);
    }

}
