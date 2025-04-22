
public class Task4 {
    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        printInfo("Anna");
        printInfo("Mark", 22);
=======
package Lab2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть ім'я: ");
        String name = input.nextLine();

        System.out.print("Введіть вік: ");
        int age = input.nextInt();

        System.out.println("println: Ім'я: " + name + ", Вік: " + age);
        System.out.println("printf: Ім'я: " + name + ", Вік: " + age);

    }
}
