public class Task11 {
    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Максимум: " + findMax(3, 8, 5, 2));
        System.out.println("Максимум: " + findMax(14, 7));
    }
}
