import listeners.EmailNotificationListener;
import listeners.LogOpenListener;
import observerEditor.ObserverEditor;

public class ObserverDemo {

    public static void main(String[] args) {
        ObserverEditor editor = new ObserverEditor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
