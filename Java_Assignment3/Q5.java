interface UPIPayment {
    void payViaUPI();
}

interface CardPayment {
    void payViaCard();
}

class OnlinePayment implements UPIPayment, CardPayment {
    public void payViaUPI() {
        System.out.println("Paid ₹500 via UPI.");
    }

    public void payViaCard() {
        System.out.println("Paid ₹1000 via Card.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        OnlinePayment op = new OnlinePayment();
        op.payViaUPI();
        op.payViaCard();
    }
}
