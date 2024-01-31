package example1;

public class UserMain {

    public static void main(String[] args) {
        Automobile bus = new Bus(new Produce(), new Assemble());
        bus.manufacture();
        System.out.println();
        Automobile taxi = new Taxi(new Produce(), new Assemble());
        taxi.manufacture();
    }

}
