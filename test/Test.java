package t21;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
public class TestApp {
    @Test
    public void testMethod() {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        System.out.println("productionYear");
        sc = scanner.nextLine();
        String input1 = sc;
        System.out.println("model");
        sc = scanner.nextLine();
        String input2 = sc;
        System.out.println("brand");
        sc = scanner.nextLine();
        String input3 = sc;
        System.out.println("key1");
        sc = scanner.nextLine();
        String input4 = sc;
        System.out.println("key2");
        sc = scanner.nextLine();
        String input5 = sc;
        System.out.println("key3");
        sc = scanner.nextLine();
        String input6 = sc;
        System.out.println("Expected output");
        sc = scanner.nextLine();
        String expectedOutput = sc;
        String actualOutput = app.methodToTest(input1, input2, input3, input4, input5, input6);
        assertEquals(expectedOutput, actualOutput);
        System.out.println(assertEquals(expectedOutput, actualOutput));
    }
}


