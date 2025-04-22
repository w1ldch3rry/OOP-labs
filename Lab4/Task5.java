
public class Task5 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Площа круга: " + calculateArea(3.0));
        System.out.println("Площа прямокутника: " + calculateArea(4.0, 5.0));
=======
package Lab2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = input.nextLine();

        System.out.println("Довжина рядка: " + text.length());
        System.out.println("Перший символ: " + text.charAt(0));
        System.out.println("Останній символ: " + text.charAt(text.length() - 1));
        System.out.println("Верхній регістр: " + text.toUpperCase());
        System.out.println("Нижній регістр: " + text.toLowerCase());

        if (text.length() >= 3) {
            System.out.println("Підрядок: " + text.substring(0, 3));
        } else {
            System.out.println("Підрядок: " + text);
        }

        System.out.println("Чи містить слово \"Java\"? " + text.contains("Java"));

    }
}
