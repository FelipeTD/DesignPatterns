package problem;

public class ProblemMain {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(10, "Santander");
        CalculadoraDeJuros calculadora = new CalculadoraDeJuros();
        System.out.println(calculadora.calculaJuros(pedido));

    }

}
