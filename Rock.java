import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user choice
            System.out.println("Enter your choice (rock, paper, scissors) or 'exit' to quit: ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            // Check if the user's choice is valid
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            // Generate a random choice for the computer
            String[] choices = {"rock", "paper", "scissors"};
            Random random = new Random();
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            // Display the choices
            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
