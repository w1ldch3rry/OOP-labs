import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5, 10, 15, 20, 25, 30};

        System.out.print("Введіть число для пошуку: ");
        int target = input.nextInt();
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число знайдено!");
        } else {
            System.out.println("Число не знайдено.");
        }
    }
}
