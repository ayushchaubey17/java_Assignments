//Write a java program to mimic login of a person (Get username and password from the user and authenticate).
// The username and password should be hardcoded in a static block.

import java.util.Scanner;

public class LoginSystem {

    static String username;
    static String password;

    static {
        username = "user123";
        password = "pass456";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Login System");
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!, Welcome here");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }


    private static boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}
