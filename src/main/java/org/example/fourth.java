package org.example;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа считает площадь круга: S = 3.14 * r * r");
        System.out.print("Введите радиус: ");
        double r = scanner.nextDouble();
        if (r <= 0) {
            System.out.println("Ошибка: радиус должен быть больше 0");
            return;
        }
        double s = 3.14 * r * r;
        System.out.println("Площадь круга = " + s);
    }
}