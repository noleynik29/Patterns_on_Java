package Behavioral.Interpreter.mathematical_operations;

import Behavioral.Interpreter.interpreter.Interpreter;
<<<<<<< HEAD
=======
import Behavioral.Interpreter.mathematical_operations.Add;
import Behavioral.Interpreter.mathematical_operations.Product;
import Behavioral.Interpreter.mathematical_operations.Substract;
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04

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
