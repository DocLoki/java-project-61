package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {

    public static void play() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(100) + 1;
            int secondNumber = random.nextInt(100) + 1;

            questionsAndAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAndAnswers[i][1] = String.valueOf(findGcd(firstNumber, secondNumber));
        }

        Engine.run("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    private static int findGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return firstNumber;
    }
}
