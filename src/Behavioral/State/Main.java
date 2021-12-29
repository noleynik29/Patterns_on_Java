package Behavioral.State;

import Behavioral.State.ui.Player;
import Behavioral.State.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
