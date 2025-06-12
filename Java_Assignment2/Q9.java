class TitleCaseConverter {
    public String toTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty())
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}

public class Q9 {
    public static void main(String[] args) {
        TitleCaseConverter tc = new TitleCaseConverter();
        System.out.println("Title Case: " + tc.toTitleCase("java programming is fun"));
    }
}
