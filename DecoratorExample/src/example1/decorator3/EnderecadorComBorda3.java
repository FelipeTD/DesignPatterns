package example1.decorator3;

public class EnderecadorComBorda3 implements Enderecador3 {

    Enderecador3 enderecador;

    public EnderecadorComBorda3(Enderecador3 enderecador) {
        super();
        this.enderecador = enderecador;
    }

    public String preparaEndereco(Endereco3 endereco) {
        String preparaEndereco = enderecador.preparaEndereco(endereco);
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        preparaEndereco.lines().forEach(l -> sb.append("| " + l + "\n"));
        sb.append("---------------------");
        return sb.toString();
    }

}
