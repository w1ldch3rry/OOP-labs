import java.util.Scanner;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};
        String choice;

        do {
            String userMove;
            while (true) {
                System.out.print("Ваш вибір (rock, paper, scissors): ");
                userMove = input.nextLine().toLowerCase();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) break;
                System.out.println("Невірне введення.");
            }

            String computerMove = options[random.nextInt(3)];
            System.out.println("Комп'ютер обрав: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("Нічия!");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("scissors") && computerMove.equals("paper")) ||
                (userMove.equals("paper") && computerMove.equals("rock"))
            ) {
                System.out.println("Ви виграли!");
            } else {
                System.out.println("Ви програли!");
            }

            System.out.print("Грати ще раз? (yes/no): ");
            choice = input.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}
