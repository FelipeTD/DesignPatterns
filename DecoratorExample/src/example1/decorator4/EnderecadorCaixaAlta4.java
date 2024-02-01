package example1.decorator4;

public class EnderecadorCaixaAlta4 extends EnderecadorDecorator {

    public EnderecadorCaixaAlta4(Enderecador4 enderecador) {
        super(enderecador);
    }

    public String preparaEndereco(Endereco4 endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }

}
