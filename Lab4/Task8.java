
public class Task8 {
    static int counter = 0;

    public static void setCounter(int counter) {
        System.out.println("Передане значення: " + counter);
    }

    public static void main(String[] args) {
        setCounter(99);
        System.out.println("Глобальна змінна: " + counter);
=======
package Lab2;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть електрону пошту: ");
        String email = input.nextLine();

        if (email.contains("@")) {
            int index = email.indexOf("@");
            String username = email.substring(0, index);
            String domain = email.substring(index + 1);

            System.out.println("Інформація про користувача: username – " + username + ", поштовий сервіс - " + domain);
        } else {
            System.out.println("Ви ввели не електрону адресу. Спробуйте ще раз.");
        }

    }
}
