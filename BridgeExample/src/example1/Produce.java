package example1;

import example1.Workshop;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
