package example1.decorator2;

public class Decorator2 {

    public static void main(String[] args) {
        Endereco2 endereco = new Endereco2("Rua 4 Casa 123", "Centro", "São José", "RN", "50930-123");

        Enderecador2 enderecador = new EnderecadorSimples2();
        enderecador = new EnderecadorCaixaAlta2(enderecador);

        String enderecoFormatado = enderecador.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }

}
