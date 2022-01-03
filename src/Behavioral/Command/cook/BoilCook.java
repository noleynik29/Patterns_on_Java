package Behavioral.Command.cook;

import Behavioral.Command.waiter.Waiter;

public class BoilCook extends Cook{
    public BoilCook(Waiter waiter) {
        super(waiter);
    }

    @Override
    public boolean cook() {
        waiter.textField.setText("Boiled food");
        order();
        return true;
    }
}
