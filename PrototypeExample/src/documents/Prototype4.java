package documents;

public class Prototype4 {

    public static void main(String[] args) {
        // entradas de usuário
        criarModelo("PDF", "RESTRITO");
        criarModelo("DOC", "RESTRITO");
        criarModelo("PDF", "PUBLICO");
        criarModelo("DOC", "PUBLICO");

        DocumentosRegistry4 registry = DocumentosRegistry4.getInstance();

        Document4 novoDoc = registry.getDocumento4("DOC RESTRITO");
        novoDoc.nome = "novo doc";
        System.out.println(novoDoc);

//        Documento4 novoDoc4 = registry.getDocumento4("DOC RESTRITO");
//        System.out.println(novoDoc4);
    }

    private static void criarModelo(String tipo, String visibilidade) {
        Document4 documento = new Document4();
        documento.tipo = tipo;
        documento.visibilidade = visibilidade;
        documento.nome = tipo + " " + visibilidade;

        String chave = tipo + " " + visibilidade;
        DocumentosRegistry4.getInstance().addDocumento4(chave, documento);
    }

}
