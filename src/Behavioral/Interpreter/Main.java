package Behavioral.Interpreter;

import Behavioral.Interpreter.mathematical_operations.ExpressionUtils;
import Behavioral.Interpreter.interpreter.Interpreter;
import Behavioral.Interpreter.number.Number;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String tokenString = "6 4 - 8 3 + *";
        Stack<Interpreter> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                Interpreter rightInterpreter = stack.pop();
                Interpreter leftInterpreter = stack.pop();
                Interpreter operator = ExpressionUtils.getOperator(s, leftInterpreter,rightInterpreter);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                Interpreter i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("( "+tokenString+" ): "+stack.pop().interpret());

    }
}
