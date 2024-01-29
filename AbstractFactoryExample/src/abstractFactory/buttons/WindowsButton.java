package abstractFactory.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Voce criou um WindowsButton");
    }
}
