package Behavioral.Command.cook;

import Behavioral.Command.waiter.Waiter;

<<<<<<< HEAD
public abstract class   Cook {
=======
public abstract class Cook {
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
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
