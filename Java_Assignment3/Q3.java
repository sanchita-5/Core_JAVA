abstract class Payment {
    String transactionID = "TXN123";
    double amount = 1000;
    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    public void processPayment() {
        double total = amount + (amount * 0.02);
        System.out.println("Credit Card Payment: $" + total);
    }
}

class PayPalPayment extends Payment {
    public void processPayment() {
        double total = amount + (amount * 0.03);
        System.out.println("PayPal Payment: $" + total);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        p1.processPayment();
        p2.processPayment();
    }
}
