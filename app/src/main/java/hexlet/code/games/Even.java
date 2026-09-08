package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static void play() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run(
                "Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }
}
