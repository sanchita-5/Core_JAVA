class Product {
    String productName = "iPhone 14";
    double price = 999;
}

class Electronics extends Product {
    String warrantyPeriod = "1 year";
}

class Smartphone extends Electronics {
    String batteryLife = "20 hours";

    void showProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyPeriod);
        System.out.println("Battery Life: " + batteryLife);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.showProduct();
    }
}
