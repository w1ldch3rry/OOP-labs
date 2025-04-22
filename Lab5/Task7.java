import java.util.*;

public class Main {
    static final String[] SYMBOLS = {"🍒", "🍋", "🥭", "🏆", "⚓"};
    static final Map<String, int[]> PAYOUTS = Map.of(
        "🍒", new int[]{3, 2},
        "🍋", new int[]{4, 3},
        "🥭", new int[]{5, 4},
        "🏆", new int[]{10, 5},
        "⚓", new int[]{100, 6}
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance = 100;

        System.out.println("🎰 Вітаємо у грі Слот-машина!");
        System.out.println("Доступні символи: 🍒, 🍋, 🥭, 🏆, ⚓");
        System.out.println("Початковий баланс: $100\n");

        while (balance > 0) {
            System.out.printf("Ваш баланс: $%d%n", balance);
            System.out.print("Введіть суму ставки: ");

            int bet = scanner.nextInt();
            if (bet <= 0) {
                System.out.println("Ставка повинна бути більшою за 0.\n");
                continue;
            } else if (bet > balance) {
                System.out.println("Недостатньо коштів.\n");
                continue;
            }

            balance -= bet;
            String[] result = spinRow(random);
            printRow(result);
            int payout = getPayout(result, bet);
            if (payout > 0) {
                balance += payout;
                System.out.printf("🎉 Ви виграли: $%d%n", payout);
            } else {
                System.out.println("🙁 Ви програли.");
            }

            if (balance == 0) {
                System.out.println("Ваш баланс дорівнює нулю. Гра завершена.");
                break;
            }

            System.out.print("Бажаєте зіграти ще раз? (Y/N): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("y")) break;
            System.out.println();
        }

        System.out.println("Дякуємо за гру!");
        scanner.close();
    }

    static String[] spinRow(Random random) {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = SYMBOLS[random.nextInt(SYMBOLS.length)];
        }
        return result;
    }

    static void printRow(String[] row) {
        System.out.println("**************************");
        System.out.printf("  %s | %s | %s%n", row[0], row[1], row[2]);
        System.out.println("**************************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return bet * PAYOUTS.get(row[0])[0];
        } else if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            return bet * PAYOUTS.get(row[0])[1];
        } else if (row[1].equals(row[2])) {
            return bet * PAYOUTS.get(row[1])[1];
        }
        return 0;
    }
}
