package com.company.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        double side, firstC,secondC,radius;
        System.out.println("Введите желаемое кол-во фигур");
        int N = sc.nextInt();
        Area[] figure = new Area[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Введите желаемую фигуру: " +
                    "1 - Квадрат, 2 - Круг, 3 - Правильный треугольник");
            int choice = sc.nextInt();
            switch (choice) {
                case 1->{
                    System.out.println("Введите сторону квадрата");
                    side = scanner.nextDouble();
                    figure[i] = new Square(side);
                }
                case 2->{
                    System.out.println("Введите радиус круга");
                    radius = scanner.nextDouble();
                    figure[i] = new Circle(radius);
                }
                case 3->{
                    System.out.println("Введите 2 катета треугольника");
                    firstC = scanner.nextDouble();
                    secondC = scanner.nextDouble();
                    figure[i] = new RightTriangle(firstC,secondC);
                }
                default -> System.out.println("Неправильный ввод!");
            }
        }
        System.out.println("Площади введённых фигур:");
        for (int i = 0; i < N; i++) {
            figure[i].calculateArea();
        }
    }
}
