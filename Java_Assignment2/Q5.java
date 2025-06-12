import java.util.Arrays;

class AnagramUtil {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}

public class Q5 {
    public static void main(String[] args) {
        AnagramUtil au = new AnagramUtil();
        System.out.println("Is Anagram: " + au.isAnagram("anagram", "nagaram"));
    }
}
