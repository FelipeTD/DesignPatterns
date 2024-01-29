package abstractFactory.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Voce criou um MacOSButton");
    }
}
