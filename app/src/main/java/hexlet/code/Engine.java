package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS_COUNT = 3;

    public static void run(
            String gameDescription, String[][] questionsAndAnswers, String name, Scanner scanner) {

        System.out.println(gameDescription);

        for (int round = 0; round < ROUNDS_COUNT; round++) {
            String question = questionsAndAnswers[round][0];
            String correctAnswer = questionsAndAnswers[round][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer = scanner.nextLine();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + answer
                                + "' is wrong answer ;(. Correct answer was '"
                                + correctAnswer
                                + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
