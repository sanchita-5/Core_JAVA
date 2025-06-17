import java.io.*;
import java.util.*;

class FileComparator {
    void compareFiles(String f1, String f2, String result) throws IOException {
        List<String> lines1 = Files.readAllLines(new File(f1).toPath());
        List<String> lines2 = Files.readAllLines(new File(f2).toPath());
        PrintWriter pw = new PrintWriter(result);
        int max = Math.max(lines1.size(), lines2.size());

        for (int i = 0; i < max; i++) {
            String line1 = i < lines1.size() ? lines1.get(i) : "";
            String line2 = i < lines2.size() ? lines2.get(i) : "";
            if (!line1.equals(line2))
                pw.println("Line " + (i + 1) + " differs:\nA: " + line1 + "\nB: " + line2 + "\n");
        }
        pw.close();
        System.out.println("Comparison done.");
    }
}

public class Q10 {
    public static void main(String[] args) throws IOException {
        new FileComparator().compareFiles("fileA.txt", "fileB.txt", "comparison_result.txt");
    }
}
