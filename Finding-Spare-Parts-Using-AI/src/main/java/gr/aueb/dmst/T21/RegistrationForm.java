package gr.aueb.dmst.T21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! Choose 1 to Sing in or 2 to Sing up : "); //Σύνδεση ή Εγγραφή
        String choice = scanner.nextLine();

        if (choice.equals("1")) { //Σύνδεση
            System.out.println("Sing in");

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch(java.lang.ClassNotFoundException e) {
                System.out.println("ClassNotFoundException: " + e.getMessage());
                System.exit(0);
            }
            try { //Ελεγχος εγκυρότητας στοίχειων χρηστη
                Connection connection = DriverManager.getConnection("jdbc:localhost:3306/T21?useSSL=false", "root", "PrJaT232!84!1");
    
                String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";
    
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
    
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) { //Κώδικας που τρέχει αφού συμδεθεί ο χρήστης
                    System.out.println("Sing in completed!");

                    App app = new App();
                    chatGPT ch = new chatGPT();

                    String message = app.model();

                    System.out.println(ch.chatGPT(message));
                } else {
                    System.out.println("Username or password is wrong.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (choice.equals("2")){ //Εγγραφή
            System.out.println("Sing up");

            boolean validInput = false;
            String username = "";
            String password = "";
            String email = "";

            while (!validInput) {
                System.out.print("New Username: ");
                username = scanner.nextLine();

                System.out.print("New Password: ");
                password = scanner.nextLine();

                System.out.print("E-mail: ");
                email = scanner.nextLine();

                try { //Έλεγχος εγκυρότητας username και email
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/T21?useSSL=false", "root", "PrJaT232!84!1");

                    String checkUser = "SELECT * FROM Users WHERE username = ? OR email = ?";
                    PreparedStatement statement = connection.prepareStatement(checkUser);
                    statement.setString(1, username);
                    statement.setString(2, email);
                    ResultSet resultSet = statement.executeQuery();

                    if (resultSet.next()) {
                        System.out.println("Username or E-mail already exists. Please select something else.");
                    } else {
                        validInput = true;
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            try { //Καταχώρηση στοιχείων χρήστη στη βάση
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/T21?useSSL=false", "root", "PrJaT232!84!1");

                String sql = "INSERT INTO Users (username, password, email) VALUES (?, ?, ?)";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                statement.setString(3, email);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Sing up completed!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Wrong! Please choose 1 or 2"); //Μήνυμα λάθος καταχώρησης για εγγραφή ή σύνδεση
        }
        scanner.close();
    }
}
