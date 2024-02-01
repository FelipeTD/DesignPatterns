package example1.decorator3;

public class EnderecadorCaixaAlta3 implements Enderecador3 {

    Enderecador3 enderecador;

    public EnderecadorCaixaAlta3(Enderecador3 enderecador) {
        super();
        this.enderecador = enderecador;
    }

    public String preparaEndereco(Endereco3 endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }

}
