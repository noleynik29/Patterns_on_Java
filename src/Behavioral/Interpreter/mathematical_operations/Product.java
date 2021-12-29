package Behavioral.Interpreter.mathematical_operations;

import Behavioral.Interpreter.interpreter.Interpreter;

public class Product implements Interpreter {
    private final Interpreter leftInterpreter;
    private final Interpreter rightInterpreter;

    public Product(Interpreter leftInterpreter,Interpreter rightInterpreter ){
        this.leftInterpreter = leftInterpreter;
        this.rightInterpreter = rightInterpreter;
    }
    @Override
    public int interpret() {
        return leftInterpreter.interpret() * rightInterpreter.interpret();
    }
}
