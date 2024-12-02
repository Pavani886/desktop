import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the name entered by the user
        String name = scanner.nextLine();

        // Display the entered name
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
