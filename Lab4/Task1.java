
public class Task1 {
    public static void printMessage() {
        System.out.println("Hello, Java Methods!");
    }

    public static void main(String[] args) {
        printMessage();
=======
package Lab2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Число є додатнім.");
        } else if (number < 0) {
            System.out.println("Число є від’ємним.");
        } else {
            System.out.println("Число є нулем.");
        }

    }
}
