package java11Features.Strings;

import java.util.Scanner;

public class RepeatMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt the user to enter a repeat count
        System.out.print("Enter a repeat count: ");
        int count = scanner.nextInt();

        // Call the repeat() method to repeat the input string
        String repeatedString = input.repeat(count);

        // Print the repeated string
        System.out.println("Repeated string: " + repeatedString);
    }
}
