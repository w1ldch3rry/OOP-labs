import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = 7;
        int guess;

        do {
            System.out.print("Вгадайте число: ");
            guess = input.nextInt();
        } while (guess != secret);

        System.out.println("Вірно!");
    }
}
