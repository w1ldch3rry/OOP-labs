public class Task6 {
    public static void main(String[] args) {
        int[] arr = {45, 2, 87, 13, 56, 3, 22};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int evenCount = 0;

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
            if (num % 2 == 0) evenCount++;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Мінімум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Середнє: " + avg);
        System.out.println("Кількість парних: " + evenCount);
    }
}
