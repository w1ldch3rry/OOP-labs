package Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус кола: ");
        double radius = scanner.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("Площа кола: " + area);

        scanner.close();
    }
}
