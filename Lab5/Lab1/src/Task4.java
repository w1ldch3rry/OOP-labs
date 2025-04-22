package Lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;

        System.out.println("Повнолітній: " + isAdult);

        scanner.close();
    }
}
