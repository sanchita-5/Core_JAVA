class PrefixFinder {
    public String findPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = "";
        for (int i = 0; ; i++) {
            if (i >= strs[0].length()) break;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return result;
                }
            }
            result += ch;
        }
        return result;
    }
}

public class Q1LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        PrefixFinder pf = new PrefixFinder();
        System.out.println(pf.findPrefix(strs1));

        String[] strs2 = {"dog", "race", "car"};
        System.out.println(pf.findPrefix(strs2));
    }
}