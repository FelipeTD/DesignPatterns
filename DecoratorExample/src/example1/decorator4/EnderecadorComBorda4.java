package example1.decorator4;

public class EnderecadorComBorda4 extends EnderecadorDecorator {

    public EnderecadorComBorda4(Enderecador4 enderecador) {
        super(enderecador);
    }

    public String preparaEndereco(Endereco4 endereco) {
        String preparaEndereco = enderecador.preparaEndereco(endereco);
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        preparaEndereco.lines().forEach(l -> sb.append("| " + l + "\n"));
        sb.append("---------------------");
        return sb.toString();
    }

}
