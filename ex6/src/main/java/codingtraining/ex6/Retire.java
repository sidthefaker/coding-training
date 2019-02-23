package codingtraining.ex6;

import java.util.Calendar;
import java.util.Scanner;

public class Retire {
    public static final String REMAINING_FORMAT = "You have %d years left util you can retire.\nIt's %d, so you can retire in %d";
    public static final String RETIRED_FORMAT = "You have already retired since %d. It's %d, so %d years passed after your retirement.";

    public static final int CURR_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    public static String calculateRetire(int age, int retirement) throws Exception {
        if (age <= 0 || retirement <= 0)
            throw new Exception("age must be positive number.");

        int remain = retirement - age;
        if (remain > 0)
            return String.format(REMAINING_FORMAT, remain, CURR_YEAR, CURR_YEAR - remain);
        else
            return String.format(RETIRED_FORMAT, CURR_YEAR + remain, CURR_YEAR, -remain);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input current age: ");
        String age = scanner.nextLine();
        System.out.print("Input current retirement: ");
        String retirement = scanner.nextLine();

        try {
            System.out.println(calculateRetire(Integer.parseInt(age), Integer.parseInt(retirement)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
