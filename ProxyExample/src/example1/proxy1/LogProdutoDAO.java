package example1.proxy1;

public class LogProdutoDAO extends ProdutoDAO {

    @Override
    public Object find(long id) {
        System.out.println("Buscando produto com id " + id);
        Object find = super.find(id);
        System.out.println("Buscando produto com id " + id);
        return find;
    }

}
