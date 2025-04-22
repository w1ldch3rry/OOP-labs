import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;

        do {
            System.out.println("\n1. Перевірити баланс");
            System.out.println("2. Внести кошти");
            System.out.println("3. Зняти кошти");
            System.out.println("4. Вийти");
            System.out.print("Ваш вибір: ");
            choice = input.nextInt();

            if (choice == 1) {
                showBalance(balance);
            } else if (choice == 2) {
                balance += deposit(input);
            } else if (choice == 3) {
                balance = withdraw(input, balance);
            } else if (choice == 4) {
                System.out.println("Завершення роботи.");
            } else {
                System.out.println("Невірний вибір.");
            }
        } while (choice != 4);

        input.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Поточний баланс: %.2f грн\n", balance);
    }

    static double deposit(Scanner input) {
        System.out.print("Сума для внесення: ");
        double amount = input.nextDouble();
        return amount > 0 ? amount : 0;
    }

    static double withdraw(Scanner input, double balance) {
        System.out.print("Сума для зняття: ");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Недостатньо коштів або неправильна сума.");
            return balance;
        }
    }
}
