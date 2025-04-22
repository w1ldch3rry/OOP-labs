package Lab2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть два числа: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Максимальне число: " + max);
    }
}
