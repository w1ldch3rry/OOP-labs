import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Скільки кубиків кинути: ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Кількість повинна бути більше нуля.");
            return;
        }

        int total = 0;

        for (int i = 0; i < count; i++) {
            int roll = rand.nextInt(6) + 1;
            total += roll;
            print(roll);
        }

        System.out.println("Загальна сума: " + total);
        input.close();
    }

    static void print(int roll) {
        switch (roll) {
            case 1:
                System.out.println("[     ]\n[  *  ]\n[     ]");
                break;
            case 2:
                System.out.println("[*    ]\n[     ]\n[    *]");
                break;
            case 3:
                System.out.println("[*    ]\n[  *  ]\n[    *]");
                break;
            case 4:
                System.out.println("[*   *]\n[     ]\n[*   *]");
                break;
            case 5:
                System.out.println("[*   *]\n[  *  ]\n[*   *]");
                break;
            case 6:
                System.out.println("[* * *]\n[     ]\n[* * *]");
                break;
        }
        System.out.println();
    }
}
