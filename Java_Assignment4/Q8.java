import java.io.*;

class Expense {
    String date, category, desc;
    double amount;

    Expense(String d, String c, double a, String desc) {
        date = d;
        category = c;
        amount = a;
        this.desc = desc;
    }

    public String toString() {
        return date + "," + category + "," + amount + "," + desc;
    }
}

class ExpenseTracker {
    void addExpense(Expense e, String file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        fw.write(e + "\n");
        fw.close();
    }
}

public class Q8 {
    public static void main(String[] args) throws IOException {
        Expense e = new Expense("2025-04-01", "Food", 150.0, "Lunch");
        ExpenseTracker et = new ExpenseTracker();
        et.addExpense(e, "expenses.txt");
    }
}
