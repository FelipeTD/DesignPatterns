package example1.decorator1;

public class EnderecadorCaixaAlta {

    EnderecadorSimples enderecador;

    public EnderecadorCaixaAlta(EnderecadorSimples enderecador) {
        super();
        this.enderecador = enderecador;
    }

    public String preparaEndereco(Endereco endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }

}
