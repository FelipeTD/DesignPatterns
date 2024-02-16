import ui.Player;
import ui.UI;

public class StateDemo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
