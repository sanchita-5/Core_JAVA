import java.util.*;

class UniqueChecker {
    public boolean hasAllUnique(String str) {
        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!seen.add(c)) return false;
        }
        return true;
    }
}

public class Q7 {
    public static void main(String[] args) {
        UniqueChecker uc = new UniqueChecker();
        System.out.println("Result: " + (uc.hasAllUnique("abcde") ? "All unique" : "Duplicates found"));
    }
}
