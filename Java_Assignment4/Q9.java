import java.io.*;

class EncryptedFileReader {
    String decryptLine(String line) {
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray())
            sb.append((char)(c - 3)); // Caesar shift -3
        return sb.toString();
    }

    void decryptFile(String input, String output) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(input));
        FileWriter fw = new FileWriter(output);
        String line;
        while ((line = br.readLine()) != null)
            fw.write(decryptLine(line) + "\n");
        br.close(); fw.close();
        System.out.println("File decrypted.");
    }
}

public class Q9 {
    public static void main(String[] args) throws IOException {
        new EncryptedFileReader().decryptFile("secret_data.enc", "decrypted.txt");
    }
}

