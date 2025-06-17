import java.io.*;

class FileViewer {
    void displayFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}

public class Q7 {
    public static void main(String[] args) throws IOException {
        new FileViewer().displayFile("message.txt");
    }
}
