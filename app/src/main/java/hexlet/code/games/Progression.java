package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    public static void play(String name, Scanner scanner) {
        Random random = new Random();

        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(20);
            int step = random.nextInt(10) + 1;
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            StringBuilder progression = new StringBuilder();
            String correctAnswer = "";

            for (int index = 0; index < PROGRESSION_LENGTH; index++) {
                int currentElement = start + index * step;

                if (index == hiddenIndex) {
                    progression.append("..");
                    correctAnswer = String.valueOf(currentElement);
                } else {
                    progression.append(currentElement);
                }

                if (index < PROGRESSION_LENGTH - 1) {
                    progression.append(" ");
                }
            }

            questionsAndAnswers[i][0] = progression.toString();
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run(
                "What number is missing in the progression?", questionsAndAnswers, name, scanner);
    }
}
