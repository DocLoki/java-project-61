package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(1, 100);
            int secondNumber = Utils.generateNumber(1, 100);
            String operator = operators[Utils.generateNumber(0, operators.length - 1)];

            int result = calculateExpression(firstNumber, secondNumber, operator);

            questionsAndAnswers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            questionsAndAnswers[i][1] = String.valueOf(result);
        }

        Engine.run("What is the result of the expression?", questionsAndAnswers);
    }

    private static int calculateExpression(int firstNumber, int secondNumber, String operator) {

        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Unknown operator " + operator);
        }
    }
}
