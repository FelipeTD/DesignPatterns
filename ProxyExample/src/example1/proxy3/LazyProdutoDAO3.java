package example1.proxy3;

public class LazyProdutoDAO3 implements IProdutoDAO3 {

    private IProdutoDAO3 daoReal;

    @Override
    public Object find(long id) {
        inicializaDAO();
        return daoReal.find(id);
    }

    private void inicializaDAO() {
        if (daoReal == null) {
            daoReal = new ProdutoDAO3();
        }
    }

}
