import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть початкову суму вкладу: ");
        double principal = input.nextDouble();

        System.out.print("Введіть місячний платіж: ");
        double monthlyDeposit = input.nextDouble();

        System.out.print("Введіть річну процентну ставку (в %): ");
        double annualRate = input.nextDouble();

        System.out.print("Введіть кількість років вкладу: ");
        int years = input.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        int timesCompounded = input.nextInt();

        annualRate /= 100;

        double futureValue = principal * Math.pow(1 + annualRate / timesCompounded, timesCompounded * years);

        for (int i = 1; i <= years * 12; i++) {
            futureValue += monthlyDeposit * Math.pow(1 + annualRate / timesCompounded, timesCompounded * ((double)(years * 12 - i) / 12));
        }

        System.out.printf("The amount after %d years is: $%.2f%n", years, futureValue);

        input.close();
    }
}
