package abstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Voce criou um WindowsCheckbox");
    }
}
