package example1;

public class Taxi extends Automobile {

    public Taxi(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void manufacture() {
        System.out.print("Tax is ");
        workshop1.work();
        workshop2.work();
    }
}
