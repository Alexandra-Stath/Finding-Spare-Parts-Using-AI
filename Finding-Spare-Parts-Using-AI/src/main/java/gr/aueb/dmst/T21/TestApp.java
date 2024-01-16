package gr.aueb.dmst.T21;
import java.util.Scanner;
public class TestApp {
    static App app = new App(); // Make app global and static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Run the program (1)\nExit (0)");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline left in the buffer

            if (choice == 1) {
                performTest(sc);
            }
            System.out.println("Press (1) to continue, press (0) to exit");
        } while (choice != 0);
        
        sc.close(); // Close the scanner when done
    }

    private static void performTest(Scanner sc) {
        System.out.println("productionYear: ");
        String input1 = sc.nextLine();

        System.out.println("model: ");
        String input2 = sc.nextLine();

        System.out.println("brand: ");
        String input3 = sc.nextLine();

        System.out.println("key3: ");
        String input4 = sc.nextLine();

        System.out.println("Expected output: ");
        String expectedOutput = sc.nextLine();

        // Check the true value
        chatGPT ch = new chatGPT();
        String message = "Give me details about " + input4 + ", " + input3 + " " + input2 + " " + input1 + ".";  // Question for AI
        String answer = ch.chatGPT(message);

        if (answer.equals(expectedOutput)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            // Print both outputs
            System.out.println("Expected output: " + expectedOutput);
            System.out.println("Actual output: " + answer);
        }
    }
}
