package com.oops;

public class Circle {
    double radius;
    double circumstance;

    double pi = 3.14, area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void Area() {
        area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }

    public void Circumstance() {
        circumstance = 2 * 3.14 * radius;
        System.out.println("Circumstance of the circle "+circumstance);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(19);
        c1.Area();
        c1.Circumstance();

    }
}
