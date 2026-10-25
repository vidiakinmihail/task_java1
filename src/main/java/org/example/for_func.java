package org.example;

import java.util.Scanner;

public class for_func {
        static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите x: ");
            double x = scanner.nextDouble();
            double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 5;
            System.out.println(y);

        }
}
