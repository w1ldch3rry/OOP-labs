package Lab2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double number = input.nextDouble();

        System.out.println("Квадратний корінь: " + Math.sqrt(number));
        System.out.println("Округлене значення: " + Math.round(number));
        System.out.println("Піднесене до квадрату: " + (number * number));
        System.out.println("Синус числа: " + Math.sin(number));
    }
}
