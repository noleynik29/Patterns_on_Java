package Behavioral.Interpreter.mathematical_operations;

import Behavioral.Interpreter.interpreter.Interpreter;

public class ExpressionUtils {
    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        else
            return false;
    }

    public static Interpreter getOperator(String s, Interpreter left, Interpreter right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }
}
