package chupikov;

import java.util.Scanner;

public class Task3 {
    /**
     * В main вводятся выражения до тех пор, пока пользователь не напишет ключевое слово quit
     * @param args - Не используются
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите выражение в формате: \"число\" \"операция\" \"число\"\nДля выхода введите фразу \"quit\".\n");
        while (true) {
            System.out.print("Введите выражение: ");
            String inputString = scanner.nextLine();
            if(inputString.equals("quit"))
                break;
            if(Calculator.checkExpression(inputString))
                continue;
            double result = Calculator.calculateExpression(inputString.split(" "));
            System.out.println("Результат выражения равен: " + result + "\n");
        }
        System.out.println("\n\nВы вышли из программы!");
    }
}
