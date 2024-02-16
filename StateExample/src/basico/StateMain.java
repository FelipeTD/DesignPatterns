package basico;

public class StateMain {

    public static void main(String[] args) {

        MobileContext context = new MobileContext();
        context.alert();

        context.setState(new Silent());
        context.alert();

        System.out.println("Colocando em mode ringing de novo");
        context.setState(new Ringing());
        context.alert();

    }

}
