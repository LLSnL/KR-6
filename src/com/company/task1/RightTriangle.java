package com.company.task1;

public class RightTriangle implements Area {

    private final double firstC;
    private final double secondC;

    public RightTriangle(double firstC, double secondC) {
        this.firstC = firstC;
        this.secondC = secondC;
    }

    @Override
    public void calculateArea() {
        System.out.println(firstC * secondC / 2);
    }
}
