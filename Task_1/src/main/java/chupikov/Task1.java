package chupikov;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int firstNum = inputScanner.nextInt();
        int secondNum = inputScanner.nextInt();
        if(firstNum < secondNum)
            System.out.println("\nМинимальное число: " + firstNum);
        else if (firstNum > secondNum)
            System.out.println("\nМинимальное число " + secondNum);
        else System.out.println("\nВведённые числа равны");
    }
}
