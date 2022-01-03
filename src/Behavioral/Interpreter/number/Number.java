package Behavioral.Interpreter.number;

import Behavioral.Interpreter.interpreter.Interpreter;

public class Number implements Interpreter {
    private final int n;

    public Number(int n){
        this.n = n;
    }
    @Override
    public int interpret() {
        return n;
    }
}
