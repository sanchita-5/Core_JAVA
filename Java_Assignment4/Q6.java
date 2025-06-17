import java.io.*;

class CharacterCounter {
    int countCharacters(String file) throws IOException {
        FileReader fr = new FileReader(file);
        int count = 0;
        while (fr.read() != -1) count++;
        fr.close();
        return count;
    }
}

public class Q6 {
    public static void main(String[] args) throws IOException {
        CharacterCounter cc = new CharacterCounter();
        System.out.println("Character count: " + cc.countCharacters("story.txt"));
    }
}
