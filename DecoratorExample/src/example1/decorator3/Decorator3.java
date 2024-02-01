package example1.decorator3;

public class Decorator3 {

    public static void main(String[] args) {
        Endereco3 endereco = new Endereco3("Rua 4 Casa 133", "Centro", "São José", "RN", "50930-133");

        Enderecador3 enderecador = new EnderecadorSimples3();
        enderecador = new EnderecadorCaixaAlta3(enderecador);
        enderecador = new EnderecadorComBorda3(enderecador);

        String enderecoFormatado = enderecador.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }

}
