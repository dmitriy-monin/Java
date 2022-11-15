package GeekBrains.Исключения.Seminar_2.Homework;

import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String index = scanner.nextLine();
        if (index.length() > 0) {
            System.out.println("Введенная строка: " + index);
        } else {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }
}
