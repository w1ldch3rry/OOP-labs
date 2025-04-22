public class Task9 {
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Сума: " + sum(1, 2, 3));
        System.out.println("Сума: " + sum(10, 20));
    }
}
