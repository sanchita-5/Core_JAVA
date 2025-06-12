class LongestWordFinder {
    public String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }
}

public class Q8 {
    public static void main(String[] args) {
        String sentence = "Innovation distinguishes between a leader and a follower.";
        LongestWordFinder lw = new LongestWordFinder();
        System.out.println("Longest Word: " + lw.findLongestWord(sentence));
    }
}
