package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
    }
}

class Shape {
    void area() {
        System.out.println("I am in shape.");
    }
}

class Circle extends Shape {
    @Override //This is Annotation. To check the method is Override or not.
    void area() {
        System.out.println("Area is pi * r * r");
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}
