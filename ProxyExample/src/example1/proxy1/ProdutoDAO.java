package example1.proxy1;

public class ProdutoDAO {

    public ProdutoDAO() {
        simulaTempoAlto();
    }

    public Object find(long id) {
        // Busca produto e retorna
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            // Cria conexão com o banco
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
