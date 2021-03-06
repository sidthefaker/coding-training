package condingtraining.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputUtil {
    private static final int RETRY_LIMIT = Integer.parseInt(System.getProperty("codingtraining.util.retry-limit", "-1"));
    private static final Scanner scanner = new Scanner(new BufferedInputStream(System.in));

    public static int inputInteger(String text) throws IOException {
        return inputInteger(text, (input) -> true);
    }

    public static int inputInteger(String text, IntegerInputValidater condition) throws IOException {
        int count = 0;
        while (RETRY_LIMIT > 0 && RETRY_LIMIT >= count) {
            System.out.print(text);
            String inputText = scanner.nextLine();
            try {
                int input = Integer.parseInt(inputText);
                if (condition == null || condition.validate(input))
                    return input;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
            count++;
        }

        throw new IOException("invalid input");
    }
}
