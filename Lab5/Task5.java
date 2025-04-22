import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] questions = {
            "Що таке JVM?",
            "Який тип даних у Java використовується для збереження десяткових чисел?",
            "Скільки байт займає тип int у Java?",
            "Який цикл виконується мінімум один раз незалежно від умови?",
            "Що таке інкапсуляція?"
        };

        String[][] options = {
            {"1. Java Visual Machine", "2. Java Virtual Machine", "3. Just Visual Memory"},
            {"1. int", "2. char", "3. double"},
            {"1. 2", "2. 4", "3. 8"},
            {"1. while", "2. do-while", "3. for"},
            {"1. Процес приховування даних", "2. Метод шифрування", "3. Нічого з вищенаведеного"}
        };

        int[] answers = {2, 3, 2, 2, 1};

        Scanner input = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }
            System.out.print("Ваша відповідь (1-3): ");
            int userAnswer = input.nextInt();
            if (userAnswer == answers[i]) {
                score++;
            }
        }

        System.out.println("Правильних відповідей: " + score + " з " + questions.length);
        input.close();
    }
}
