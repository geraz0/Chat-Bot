import java.util.Scanner;
import java.util.Random;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello, human :)");
        System.out.print(">>> ");
        scanner.nextLine();  // Just to pause and let the user read the greeting

        System.out.println("What is your name?");
        System.out.print(">>> ");
        String name = scanner.nextLine();

        System.out.println("Ok, " + name + ", let me try to guess your age.");
        System.out.println("Tell me, what year were you born?");
        System.out.print(">>> ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();  // Consume the remaining newline after nextInt()

        int guessedAge = 2024 - birthYear;  // Assuming the current year is 2023

        System.out.println("Hmm, let me think...");

        System.out.println("Are you " + guessedAge + " years old? (Yes/No)");
        System.out.print(">>> ");
        String confirmation = scanner.nextLine().trim().toLowerCase();

        if (confirmation.equals("yes")) {
            System.out.println("Awesome! I guessed right!");
        } else {
            System.out.println("Oh, I must have made a mistake. Sorry about that!");
        }


        System.out.println("Now, " + name + ", please enter a number and I will count up to it.");
        System.out.print(">>> ");
        int countTo = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline after nextInt()

        System.out.println("Counting to " + countTo + ":");
        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }

        // New functionality: Testing programming knowledge
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which keyword is used to define a class in Java?");
        System.out.println("1. class");
        System.out.println("2. int");
        System.out.println("3. for");
        System.out.println("4. public");
        System.out.print("Enter the correct answer (1-4): ");
        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("That's not correct. Please try again.");
            }
        } while (answer != 1);

        System.out.println("Correct! 'class' is the right answer!");

        scanner.close();
    }
}


