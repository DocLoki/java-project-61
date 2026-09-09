package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void run(String gameDescription, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        System.out.println(gameDescription);

        for (String[] questionAndAnswer : questionsAndAnswers) {
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer = scanner.next();

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
