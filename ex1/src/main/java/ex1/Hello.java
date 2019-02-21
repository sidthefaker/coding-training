package ex1;

import java.util.Scanner;

public class Hello {
    static String getHello(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

    public static void main(String[] args) {
        System.out.print("What is your name");
        System.out.println(getHello(new Scanner(System.in).nextLine()));
    }
}
