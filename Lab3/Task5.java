import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
