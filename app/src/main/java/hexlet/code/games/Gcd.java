package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcd {

    public static void play(String name, Scanner scanner) {
        Random random = new Random();

        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);

            int gcd = findGcd(firstNumber, secondNumber);

            questionsAndAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAndAnswers[i][1] = String.valueOf(gcd);
        }

        Engine.run(
                "Find the greatest common divisor of given numbers.",
                questionsAndAnswers,
                name,
                scanner);
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
