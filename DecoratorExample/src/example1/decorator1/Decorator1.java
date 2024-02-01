package example1.decorator1;

public class Decorator1 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 4 Casa 123", "Centro", "São José", "RN", "50930-123");

        EnderecadorSimples enderecador = new EnderecadorSimples();
        EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecador);

        String enderecoFormatado = enderecadorCaixaAlta.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }

}
