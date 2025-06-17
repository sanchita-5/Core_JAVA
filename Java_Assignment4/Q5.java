import java.io.*;

class NoteTaker {
    void addNote(String note) throws IOException {
        FileWriter fw = new FileWriter("daily_log.txt", true);
        fw.write(note + "\n");
        fw.close();
        System.out.println("Note added.");
    }
}

public class Q5 {
    public static void main(String[] args) throws IOException {
        new NoteTaker().addNote("Today I studied Java file handling.");
    }
}
