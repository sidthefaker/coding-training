package codingtraining.ex3;

import java.util.*;

public class PrintQuotes {
    public static String printQuotes(String name, String quote) {
        return name + " says, \"" + quote + ".\"";
    }

    public static void main(String[] args) {
        Map<String, List<String>> words = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();
        System.out.print("Who said it? ");
        String name = scanner.nextLine();

        List<String> quotes = words.get(name);
        if (quotes == null) {
            quotes = new LinkedList<>();
            words.put(name,quotes);
        }

        quotes.add(quote);

        for (Map.Entry<String, List<String>> entries : words.entrySet()) {
            for (String q : entries.getValue()) {
                System.out.println(printQuotes(entries.getKey(), q));
            }
        }


    }
}
