import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Take a guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
        
        scanner.close();
    }
}
