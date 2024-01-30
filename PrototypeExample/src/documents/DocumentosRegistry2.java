package documents;

import java.util.HashMap;
import java.util.Map;

public class DocumentosRegistry2 {

    private static final DocumentosRegistry2 INSTANCE = new DocumentosRegistry2();

    private static final Map<String, Document1> REGISTRY = new HashMap<>();

    static {
        Document1 d1 = new Document1();
        d1.tipo = "PDF";
        d1.visibilidade = "RESTRITO";
        REGISTRY.put("PDF RESTRITO", d1);

        Document1 d2 = new Document1();
        d2.tipo = "PDF";
        d2.visibilidade = "PUBLICO";
        REGISTRY.put("PDF PUBLICO", d2);

        Document1 d3 = new Document1();
        d3.tipo = "DOC";
        d3.visibilidade = "RESTRITO";
        REGISTRY.put("DOC RESTRITO", d3);

        Document1 d4 = new Document1();
        d4.tipo = "DOC";
        d4.visibilidade = "RESTRITO";
        REGISTRY.put("DOC PUBLICO", d4);
    }

    public static DocumentosRegistry2 getInstance() {
        return INSTANCE;
    }

    public Document1 getDocumento2(String chave) {
        try {
            return REGISTRY.get(chave).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
