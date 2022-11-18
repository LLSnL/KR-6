package com.company.task1;

public class Circle implements Area {
    private static final double pi = 3.14159;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(pi * Math.pow(radius, 2));
    }
}
