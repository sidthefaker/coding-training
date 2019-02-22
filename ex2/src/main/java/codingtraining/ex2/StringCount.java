package codingtraining.ex2;

import java.util.Scanner;

public class StringCount {
    public static int calculateStringCount(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String text = scanner.nextLine();

        if (text == null || text.isEmpty())
            System.out.println("Please, type something...");
        else
            System.out.println(text + " has " + calculateStringCount(text) + " characters.");
    }
}
