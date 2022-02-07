package chupikov;

/**
 * Примитивный калькулятор.
 * Содержит в себе метод для проверки введённого выражения и метод для вычисления разультата
 */
public class Calculator {

    /**
     * Функция проверки введенной строки на корректность.
     * Проверяется количество аргументов, корректность введённых чисел,
     * Корректность введённой операции, а также случай деления на 0 или взятия остатка от него
     * @param str Введённая строка
     * @return Флаг проверки. true - строка не прошла провекру, false - прошла
     */
    public static boolean checkExpression(String str) {
        String[] args;
        args = str.split(" ");
        if (args.length != 3) {
            System.out.println("\nВведите корректное выражение.");
            return true;
        }
        try {
            Double.parseDouble(args[0]);
            Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("\nВведите выражение с корректными зачениями чисел.");
            return true;
        }
        if (!"+-*/%^".contains(args[1])) {
            System.out.println("\nВведите выражение с правильной операцией.");
            return true;
        }
        else if((args[1].equals("/") || args[1].equals("%")) && Double.parseDouble(args[2]) == 0){
            System.out.println("\nНельзя делить на 0 или находить остаток от деления на него! Повторите ввод.");
            return true;
        }
        return false;
    }

    /**
     * Метод, вычисляющий результат введенного выражения
     * @param expression - Введенная строка, прошедшая все проверки
     * @return Возвращает результат для соответствующей операции
     */
    public static double calculateExpression(String[] expression){
        return switch (expression[1]) {
            case "+" -> Double.parseDouble(expression[0]) + Double.parseDouble(expression[2]);
            case "-" -> Double.parseDouble(expression[0]) - Double.parseDouble(expression[2]);
            case "*" -> Double.parseDouble(expression[0]) * Double.parseDouble(expression[2]);
            case "/" -> Double.parseDouble(expression[0]) / Double.parseDouble(expression[2]);
            case "%" -> Double.parseDouble(expression[0]) % Double.parseDouble(expression[2]);
            default -> Math.pow(Double.parseDouble(expression[0]), Double.parseDouble(expression[2]));
        };
    }
}

