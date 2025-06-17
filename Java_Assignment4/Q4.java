import java.io.*;

class WordCounter {
    int countWords(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            count += words.length;
        }
        br.close();
        return count;
    }
}

public class Q4 {
    public static void main(String[] args) throws IOException {
        WordCounter wc = new WordCounter();
        System.out.println("Word count: " + wc.countWords("input.txt"));
    }
}
