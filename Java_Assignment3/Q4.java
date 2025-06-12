abstract class Shape {
    String color = "Red";
    abstract double calculateArea();
    abstract void draw();
}

class Circle extends Shape {
    double radius = 5;
    double calculateArea() { return Math.PI * radius * radius; }
    void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape {
    double length = 4, breadth = 3;
    double calculateArea() { return length * breadth; }
    void draw() { System.out.println("Drawing Rectangle"); }
}

public class Q4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println("Circle Area: " + c.calculateArea());
        c.draw();
        System.out.println("Rectangle Area: " + r.calculateArea());
        r.draw();
    }
}
