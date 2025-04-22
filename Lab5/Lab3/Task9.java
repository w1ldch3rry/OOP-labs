import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Введіть індекс (0-4): ");
        int index = input.nextInt();
        System.out.print("Нове значення: ");
        int value = input.nextInt();

        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        }

        System.out.println("Оновлений масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
