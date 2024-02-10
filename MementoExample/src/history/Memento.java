package history;

import editor.EditorMemento;

public class Memento {

    private String backup;
    private EditorMemento editor;

    public Memento(EditorMemento editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }

}
