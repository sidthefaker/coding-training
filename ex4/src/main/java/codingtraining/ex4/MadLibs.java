package codingtraining.ex4;

import java.util.Scanner;

public class MadLibs {
    private static final String NOUN = "${NOUN}";
    private static final String VERB = "${VERB}";
    private static final String ADJECTIVE = "${ADJECTIVE}";
    private static final String ADVERB = "${ADVERB}";

    private static final String FORMAT = "Do you ${VERB} your ${ADJECTIVE} ${NOUN} ${ADVERB}? That's hilarious";

    public static String getMadLibs(String format, String noun, String verb, String adjective, String adverb) {
        format = format.replace(NOUN, noun);
        format = format.replace(VERB, verb);
        format = format.replace(ADJECTIVE, adjective);
        format = format.replace(ADVERB, adverb);
        return format;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = scanner.nextLine();
        System.out.println(getMadLibs(FORMAT, noun, verb, adjective, adverb));
    }
}
