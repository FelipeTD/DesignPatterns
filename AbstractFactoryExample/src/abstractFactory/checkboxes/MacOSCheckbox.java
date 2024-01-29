package abstractFactory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Voce criou um MacOSCheckbox");
    }
}
