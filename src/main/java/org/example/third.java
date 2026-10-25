package org.example;

import java.util.Scanner;

public class third {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее число: " + a);
        } else {
            System.out.println("Большее число: " + b);
        }

    }
}

