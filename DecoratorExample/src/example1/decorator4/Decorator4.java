package example1.decorator4;

public class Decorator4 {

    public static void main(String[] args) {
        Endereco4 endereco = new Endereco4("Rua 4 Casa 144", "Centro", "São José", "RN", "50940-144");

        Enderecador4 enderecador = new EnderecadorSimples4();
        enderecador = new EnderecadorCaixaAlta4(enderecador);
        enderecador = new EnderecadorComBorda4(enderecador);

        String enderecoFormatado = enderecador.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }

}
