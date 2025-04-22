public class Task10 {
    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers("Список", 3, 5, 7, 9);
        printNumbers("Інші числа", 12, 15);
    }
}
