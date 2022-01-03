package Behavioral.Command.cook;

import Behavioral.Command.waiter.Waiter;

public class FryCook extends Cook{
    public FryCook(Waiter waiter) {
        super(waiter);
    }

    @Override
    public boolean cook() {
        waiter.textField.setText("Fried food");
        order();
        return true;
    }
}
