import java.io.*;

class FileCopier {
    void copyFile(String src, String dest) throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        System.out.println("File copied.");
    }
}

public class Q3 {
    public static void main(String[] args) throws IOException {
        new FileCopier().copyFile("source.txt", "destination.txt");
    }
}
