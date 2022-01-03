package Behavioral.Command.cook;

import Behavioral.Command.waiter.Waiter;

public abstract class   Cook {
    public Waiter waiter;
    private String order = "";

    Cook(Waiter waiter){
        this.waiter = waiter;
    }

    void order(){
        order += waiter.textField.getText();
    }

    public void orderСancellation(){
        waiter.textField.setText("Your order: " + order + " is cancelled");
    }

    public abstract boolean cook();
}
