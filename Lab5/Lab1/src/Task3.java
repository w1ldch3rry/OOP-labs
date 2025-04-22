package Lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення типу byte (-128 до 127): ");
        byte input = scanner.nextByte();

        double converted = input * 1.5;
        int result = (int) converted;

        System.out.println("Результат після множення (double): " + converted);
        System.out.println("Результат після перетворення в int: " + result);

        scanner.close();
    }
}
