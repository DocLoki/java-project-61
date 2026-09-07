package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            Cli.greet(scanner);
        } else if (choice == 2) {
            String name = Cli.greet(scanner);
            Even.play(name, scanner);
        } else if (choice == 3) {
            String name = Cli.greet(scanner);
            Calc.play(name, scanner);
        } else if (choice == 4) {
            String name = Cli.greet(scanner);
            Gcd.play(name, scanner);
        }
    }
}
