package Behavioral.Command;

import Behavioral.Command.waiter.Waiter;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.init();
    }
}
