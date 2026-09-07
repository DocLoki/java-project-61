package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void play(String name, Scanner scanner) {
        Random random = new Random();

        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run(
                "Answer 'yes' if the number is even, otherwise answer 'no'.",
                questionsAndAnswers,
                name,
                scanner);
    }
}
