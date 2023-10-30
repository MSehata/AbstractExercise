package org.example;

public class Main {
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle(5, 7);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Shape circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.getArea());

        Shape triangle = new Triangle(4, 6);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}

// Define the Shape interface
interface Shape {
    double getArea();
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Implement the Shape interface in the Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
