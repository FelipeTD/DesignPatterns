package documents;

public class Document1 implements Cloneable {

    public String nome;
    public String visibilidade;
    public String tipo;
    public String localizacao;

    @Override
    public Document1 clone() throws CloneNotSupportedException {
        return (Document1) super.clone();
    }

    @Override
    public String toString() {
        return "Documento1 [nome=" + nome + ", visibilidade=" + visibilidade + ", tipo=" + tipo + ", localizacao=" + localizacao
                + "]";
    }

}
