package lessons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson21_RegEx {
    public static void main(String[] args) {

        phoneMatch();
    }

//    static void patternFind() {
//        Pattern pattern = Pattern.compile("w3Schools", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Visit W3Schools!");
//        boolean matchFound = matcher.find();
//        if (matchFound) {
//            System.out.println("Match found");
//        } else {
//            System.out.println("Match not found");
//        }
//    }

//    static void split() {
//        String text = "FIFA will never regret it";
//        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
//        for (String word : words) {
//            System.out.println(word);
//        }
//    }
//
    static void phoneMatch() {
        String input = "+12343454959";
        boolean result = input.matches("(\\+)\\d{11}");
        if (result) {
            System.out.println("It is a phone number");
        } else {
            System.out.println("It is not a phone number!");
        }
    }
}
