package example1.proxy3;

public class ProdutoDAO3 implements IProdutoDAO3 {

    public ProdutoDAO3() {
        System.out.println("Criando conexão com o banco.");
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
