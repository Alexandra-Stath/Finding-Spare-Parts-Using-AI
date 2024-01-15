package gr.aueb.dmst.T21;
import java.util.Scanner;
public class TestApp {
    static App app = new App(); // make app global and static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Run the program (1)\nExit (0)");
        int choice = sc.nextInt();
        String input1 = "";
        String input2 = "";
        String input3 = "";
        //String input4 = "";
        //String input5 = "";
        String input6 = "";
        String expectedOutput = "";
        //new object for RegistrationForm
        while (choice == 1) {
            System.out.println("productionYear");
            input1 = sc.nextLine();
            sc.nextLine(); // Διαβάζει την αλλαγή γραμμής που παρέμεινε στο buffer
            System.out.println("model");
            input2 = sc.nextLine();
            System.out.println("brand");
            input3 = sc.nextLine();
            /*
            System.out.println("key1");
            input4 = sc.nextLine();
            System.out.println("key2");
            input5 = sc.nextLine();
            */
            System.out.println("key3");
            input6 = sc.nextLine();
            System.out.println("Expected output");
            expectedOutput = sc.nextLine();
            //check the true value
            chatGPT ch = new chatGPT();
            String message = "Give me details about " + input6 + ", " + input3 + " " + input2 + " " + input1 + ".";  //question for AI
            String answer = ch.chatGPT(message);
            if (answer.equals(expectedOutput)) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed");
                //print both outputs
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + answer);
            }
            System.out.println("For continue press 1, for exit press 0");
            choice = sc.nextInt();
        }
    }
}
