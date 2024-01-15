package gr.aueb.dmst.T21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import retrofit2.http.HEAD;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! Choose 1 to Sign in or 2 to Sign up: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            signIn(scanner);
        } else if (choice.equals("2")) {
            signUp(scanner);
        } else {
            System.out.println("Wrong! Please choose 1 or 2");
        }

        scanner.close();
    }

<<<<<<< HEAD
            System.out.print("Password: ");
            String password = scanner.nextLine();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch(java.lang.ClassNotFoundException e) {
                System.out.println("ClassNotFoundException: " + e.getMessage());
                System.exit(0);
            }
            try { //Έλεγχος εγκυρότητας στοίχειων χρήστη
                Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", "sql8676850", "3QIvIcrqcH");
    
                String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";
    
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
    
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) { //Κώδικας που τρέχει αφού συνδεθεί ο χρήστης
                    System.out.println("Sing in completed!");
=======
    private static void signIn(Scanner scanner) {
        System.out.println("Sign in");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", "sql8676850", "3QIvIcrqcH");

            String sql = "SELECT * FROM Users WHERE name = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
>>>>>>> a6c5ffedb1279128feed554e71f464e6df27ddbb

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Sign in completed!");

                        App app = new App();
                        chatGPT ch = new chatGPT();

                        String message = app.model();
                        System.out.println(ch.chatGPT(message));
                    } else {
                        System.out.println("Username or password is wrong.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            handleException(ex);
        }
    }

    private static void signUp(Scanner scanner) {
        System.out.println("Sign up");

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

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", "sql8676850", "3QIvIcrqcH");

                String checkUser = "SELECT * FROM Users WHERE name = ? OR email = ?";
                try (PreparedStatement statement = connection.prepareStatement(checkUser)) {
                    statement.setString(1, username);
                    statement.setString(2, email);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            System.out.println("Username or E-mail already exists. Please select something else.");
                        } else {
                            validInput = true;
                        }
                    }
                }
            } catch (SQLException ex) {
                handleException(ex);
            }
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", "sql8676850", "3QIvIcrqcH");

            String sql = "INSERT INTO Users (name, password, email) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                statement.setString(3, email);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Sign up completed!");
                }
            }
        } catch (SQLException ex) {
            handleException(ex);
        }
    }

    private static void handleException(Exception ex) {
        System.out.println("Exception: " + ex.getMessage());
        ex.printStackTrace(); // Log or print the full stack trace for debugging purposes
    }
}
