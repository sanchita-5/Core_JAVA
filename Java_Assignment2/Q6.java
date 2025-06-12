import java.util.*;

class ProfanityFilter {
    public String filterText(String input, List<String> badWords) {
        for (String word : badWords) {
            input = input.replaceAll("(?i)\\b" + word + "\\b", "***");
        }
        return input;
    }
}

public class Q6 {
    public static void main(String[] args) {
        List<String> badWords = Arrays.asList("bad", "ugly", "stupid");
        String text = "This is a bad and ugly comment.";
        ProfanityFilter pf = new ProfanityFilter();
        System.out.println("Filtered Text: " + pf.filterText(text, badWords));
    }
}
