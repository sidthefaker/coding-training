package codingtraining.ex5;

import java.util.Scanner;

public class Calculator {
    public static int add(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) {
        return first / second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        String first_str = scanner.nextLine();
        System.out.print("Input second number: ");
        String second_str = scanner.nextLine();

        try {
            int first = Integer.parseInt(first_str);
            int second = Integer.parseInt(second_str);

            if (first < 0 || second < 0)
                throw new Exception("input number must be larger than 0.");

            System.out.println(first_str + " + " + second_str + add(first, second) +
                    first_str + " - " + second_str + subtract(first, second) +
                    first_str + " * " + second_str + multiply(first, second) +
                    first_str + " / " + second_str + divide(first, second));
        } catch (Exception e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        }
    }
}
