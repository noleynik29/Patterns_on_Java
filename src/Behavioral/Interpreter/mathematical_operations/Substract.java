package Behavioral.Interpreter.mathematical_operations;

import Behavioral.Interpreter.interpreter.Interpreter;

public class Substract implements Interpreter {
    private final Interpreter leftInterpreter;
    private final Interpreter rightInterpreter;

    public Substract(Interpreter leftInterpreter,Interpreter rightInterpreter ){
        this.leftInterpreter = leftInterpreter;
        this.rightInterpreter = rightInterpreter;
    }
    @Override
    public int interpret() {
        return leftInterpreter.interpret() * rightInterpreter.interpret();
    }
}
