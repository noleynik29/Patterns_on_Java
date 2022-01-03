package Behavioral.Command.cook;

import java.util.Stack;

public class OrderHistory {
    private Stack<Cook> history = new Stack<>();

    public void push(Cook cook){
        history.push(cook);
    }

    public Cook pop(){
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
