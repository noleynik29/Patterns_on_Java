package Behavioral.Command.cook;

import Behavioral.Command.waiter.Waiter;

public class BakeCook extends Cook{
    public BakeCook(Waiter waiter) {
        super(waiter);
    }

    @Override
    public boolean cook() {
        waiter.textField.setText("Baked food");
        order();
        return true;
    }
}
