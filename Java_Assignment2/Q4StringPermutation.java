class PermutationUtil {
    public void permute(String str, int l, int r) {
        if (l == r) System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    private String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i]; ch[i] = ch[j]; ch[j] = temp;
        return new String(ch);
    }
}

public class Q4StringPermutation {
    public static void main(String[] args) {
        PermutationUtil pu = new PermutationUtil();
        pu.permute("XYZ", 0, 2);
    }
}
