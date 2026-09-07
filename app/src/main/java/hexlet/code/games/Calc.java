package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static void play(String name, Scanner scanner) {
        Random random = new Random();

        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);

            int operation = random.nextInt(3);

            String expression;
            int result;

            switch (operation) {
                case 0:
                    expression = firstNumber + " + " + secondNumber;
                    result = firstNumber + secondNumber;
                    break;
                case 1:
                    expression = firstNumber + " - " + secondNumber;
                    result = firstNumber - secondNumber;
                    break;
                default:
                    expression = firstNumber + " * " + secondNumber;
                    result = firstNumber * secondNumber;
                    break;
            }

            questionsAndAnswers[i][0] = expression;
            questionsAndAnswers[i][1] = String.valueOf(result);
        }

        Engine.run("What is the result of the expression?", questionsAndAnswers, name, scanner);
    }
}
