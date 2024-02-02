package example1.proxy2;

public class ProdutoDAO2 {

    public ProdutoDAO2() {
        simulaTempoAlto();
    }

    public Object find(long id) {
        // Busca produto e retorna
        System.out.println("Busca objeto na base.");
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
