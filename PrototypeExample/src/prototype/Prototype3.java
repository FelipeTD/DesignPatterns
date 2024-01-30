package prototype;

import documents.Document1;
import documents.DocumentosRegistry3;

public class Prototype3 {

    public static void main(String[] args) {

        criarModelo("PDF", "RESTRITO");
        // criarModelo("DOC", "RESTRITO");
        // criarModelo("PDF", "PUBLICO");
        // criarModelo("DOC", "PUBLICO");

        DocumentosRegistry3 registry = DocumentosRegistry3.getInstance();

        Document1 novoDoc = registry.getDocumento3("PDF RESTRITO");
        novoDoc.nome = "novo doc";
        System.out.println(novoDoc);

        Document1 novoDoc3 = registry.getDocumento3("PDF RESTRITO");
        System.out.println(novoDoc3);
    }

    private static void criarModelo(String tipo, String visibilidade) {
        Document1 documento = new Document1();
        documento.tipo = tipo;
        documento.visibilidade = visibilidade;
        documento.nome = tipo + " " + visibilidade;

        String chave = tipo + " " + visibilidade;
        DocumentosRegistry3.getInstance().addDocumento3(chave, documento);
    }

}
