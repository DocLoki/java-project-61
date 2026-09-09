package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.generateNumber(1, 20);
            int step = Utils.generateNumber(1, 10);
            int hiddenIndex = Utils.generateNumber(0, PROGRESSION_LENGTH - 1);

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
