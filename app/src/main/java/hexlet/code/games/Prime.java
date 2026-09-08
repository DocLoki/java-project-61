package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static void play() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(100) + 1;

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(
                "Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
