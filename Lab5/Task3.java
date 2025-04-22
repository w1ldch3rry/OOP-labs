import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Перше число: ");
        double num1 = input.nextDouble();

        System.out.print("Оператор (+, -, *, /, ^): ");
        String operator = input.next();

        System.out.print("Друге число: ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Помилка: ділення на нуль.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Невідомий оператор.");
                valid = false;
        }

        if (valid) {
            System.out.printf("Результат: %.2f\n", result);
        }

        input.close();
    }
}
