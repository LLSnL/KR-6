package com.company.task1;

public class Square implements Area {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.pow(side, 2));
    }
}
