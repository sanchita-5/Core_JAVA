class Vehicle {
    String brand = "Tesla";
    String model = "Model S";
    int year = 2023;
}

class Car extends Vehicle {
    String fuelType = "Electric";
}

class LuxuryCar extends Car {
    String feature = "Autopilot";

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Feature: " + feature);
    }
}

public class Q1 {
    public static void main(String[] args) {
        LuxuryCar car = new LuxuryCar();
        car.showDetails();
    }
}
