package java11Features.Strings;

import java.util.Scanner;

public class StripMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine().strip();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine().strip();
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password!");
        }
        scanner.close();
    }
}
