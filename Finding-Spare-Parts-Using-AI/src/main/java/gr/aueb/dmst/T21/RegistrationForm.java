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

    private static void signIn(Scanner scanner) {
        System.out.println("Sign in");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        try {
            Scanner sc1 = new Scanner(System.in);
            // Ask the user the username of DB
            System.out.println("Please enter your username of DB: ");
            String usernameDB = sc1.nextLine();
            //Ask the user the password of DB
            System.out.println("Please enter your password of DB: ");
            String passwordDB = sc1.nextLine();
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", usernameDB, passwordDB);

            String sql = "SELECT * FROM Users WHERE name = ? AND password = ?";
            sc1.close();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Sign in completed!");

                        App app = new App();
                        ChatGPT ch = new ChatGPT();

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
                Scanner sc1 = new Scanner(System.in);
                // Ask the user the username of DB
                System.out.println("Please enter your username of DB: ");
                String usernameDB = sc1.nextLine();
                //Ask the user the password of DB
                System.out.println("Please enter your password of DB: ");
                String passwordDB = sc1.nextLine();
                Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", usernameDB, passwordDB);
                sc1.close();
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
            Scanner sc1 = new Scanner(System.in);
            // Ask the user the username of DB
            System.out.println("Please enter your username of DB: ");
            String usernameDB = sc1.nextLine();
            //Ask the user the password of DB
            System.out.println("Please enter your password of DB: ");
            String passwordDB = sc1.nextLine();
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql8.freesqldatabase.com:3306/sql8676850", usernameDB, passwordDB);
            sc1.close();
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
