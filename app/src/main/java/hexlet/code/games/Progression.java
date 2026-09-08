package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    public static void play() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = random.nextInt(20);
            int step = random.nextInt(10) + 1;
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            String[] progression = generateProgression(start, step);
            String correctAnswer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";

            questionsAndAnswers[i][0] = String.join(" ", progression);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run("What number is missing in the progression?", questionsAndAnswers);
    }

    private static String[] generateProgression(int start, int step) {
        String[] progression = new String[PROGRESSION_LENGTH];

        for (int index = 0; index < PROGRESSION_LENGTH; index++) {
            progression[index] = String.valueOf(start + index * step);
        }

        return progression;
    }
}
