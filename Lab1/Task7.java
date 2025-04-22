package Lab2;
import java.util.Scanner;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введіть мінімальне значення: ");
        int min = input.nextInt();
        System.out.print("Введіть максимальне значення: ");
        int max = input.nextInt();

        int number = rand.nextInt(max - min + 1) + min;

        System.out.println("Згенероване число: " + number);
        System.out.println("Число " + number + " є " + (number % 2 == 0 ? "парним" : "непарним") + ".");
    }
}
