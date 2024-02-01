package example1.decorator4;

public abstract class EnderecadorDecorator implements Enderecador4 {

    Enderecador4 enderecador;

    public EnderecadorDecorator(Enderecador4 enderecador) {
        super();
        this.enderecador = enderecador;
    }

}
