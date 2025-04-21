import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("Дублікати:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
