package example1.proxy3;

public class ProdutoService3 {

    private IProdutoDAO3 produtoDAO;

    public ProdutoService3(IProdutoDAO3 produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id);
    }

}
