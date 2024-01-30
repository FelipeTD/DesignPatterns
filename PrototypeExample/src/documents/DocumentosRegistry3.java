package documents;

import java.util.HashMap;
import java.util.Map;

public class DocumentosRegistry3 {

    private static final DocumentosRegistry3 INSTANCE = new DocumentosRegistry3();
    private static final Map<String, Document1> REGISTRY = new HashMap<>();

    private DocumentosRegistry3() {
    }

    public static DocumentosRegistry3 getInstance() {
        return INSTANCE;
    }

    public Document1 getDocumento3(String chave) {
        try {
            return REGISTRY.get(chave).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDocumento3(String chave, Document1 documento) {
        REGISTRY.put(chave, documento);
    }

}
