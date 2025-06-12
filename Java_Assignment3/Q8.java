class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class Product {
    String name = "Laptop";
    int stock = 0;

    void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Product out of stock!");
        } else {
            stock -= quantity;
            System.out.println("Purchased " + quantity + " " + name);
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Product p = new Product();
        try {
            p.purchase(1);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
