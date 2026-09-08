package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static void play() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);
            String operator = operators[random.nextInt(operators.length)];

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
