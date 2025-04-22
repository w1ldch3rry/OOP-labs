import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        Arrays.sort(arr);

        System.out.println("Відсортований масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
