package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, площадь какой фигуры вы хотите посчитать:" +
                "\n1 - Квадрат, 2 - Круг, 3 - Правильный треугольник");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Введите сторону квадрата");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                square.calculateArea();
            }
            case 2 -> {
                System.out.println("Введите радиус круга");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                circle.calculateArea();
            }
            case 3 -> {
                System.out.println("Введите 2 катета треугольника");
                double firstC = scanner.nextDouble();
                double secondC = scanner.nextDouble();
                RightTriangle rightTriangle = new RightTriangle(firstC, secondC);
                rightTriangle.calculateArea();
            }
            default -> System.out.println("Неправильный ввод!");
        }
    }
}
