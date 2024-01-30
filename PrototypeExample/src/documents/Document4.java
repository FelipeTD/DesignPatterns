package documents;

public class Document4 {

    String nome;
    String visibilidade;
    String tipo;
    String localizacao; // url, path, etc

    public Document4() {
    }

    public Document4(Document4 documento4) {
        this.nome = documento4.nome;
        this.visibilidade = documento4.visibilidade;
        this.tipo = documento4.tipo;
        this.localizacao = documento4.localizacao;
    }

    public static Document4 clone(Document4 documento4) {
        Document4 clone = new Document4();
        clone.nome = documento4.nome;
        clone.visibilidade = documento4.visibilidade;
        clone.tipo = documento4.tipo;
        clone.localizacao = documento4.localizacao;
        return clone;
    }

    @Override
    public String toString() {
        return "Documento4 [nome=" + nome + ", visibilidade=" + visibilidade + ", tipo=" + tipo + ", localizacao=" + localizacao
                + "]";
    }

}
