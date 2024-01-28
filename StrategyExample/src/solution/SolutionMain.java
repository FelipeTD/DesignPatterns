package solution;

public class SolutionMain {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(10);
        CalculadoraDeJuros calculadora = new CalculadoraDeJuros(new Santander());
        System.out.println(calculadora.calculaJuros(pedido));

    }

}
