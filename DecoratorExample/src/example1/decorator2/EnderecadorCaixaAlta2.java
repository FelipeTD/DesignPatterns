package example1.decorator2;

public class EnderecadorCaixaAlta2 implements Enderecador2 {

    Enderecador2 enderecador;

    public EnderecadorCaixaAlta2(Enderecador2 enderecador) {
        super();
        this.enderecador = enderecador;
    }

    public String preparaEndereco(Endereco2 endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }

}
