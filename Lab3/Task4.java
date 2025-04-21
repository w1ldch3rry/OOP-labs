import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть число N: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сума від 1 до " + n + " = " + sum);
    }
}
