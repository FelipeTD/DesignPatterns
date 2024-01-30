package documents;

import java.util.HashMap;
import java.util.Map;

public class DocumentosRegistry4 {

    private static final DocumentosRegistry4 INSTANCE = new DocumentosRegistry4();
    private static final Map<String, Document4> REGISTRY = new HashMap<>();

    private DocumentosRegistry4() {
    }

    public static DocumentosRegistry4 getInstance() {
        return INSTANCE;
    }

    public Document4 getDocumento4(String chave) {
        Document4 prototype = REGISTRY.get(chave);
        return Document4.clone(prototype);
    }

    public Document4 addDocumento4(String chave, Document4 documento) {
        return REGISTRY.put(chave, documento);
    }

}
