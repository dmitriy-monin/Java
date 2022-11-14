package GeekBrains.Исключения.Seminar_2.Homework;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        System.out.println("Введенное число: " + floats());
    }

    public static float floats() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float index;
        try {
            index = Float.parseFloat(scanner.next());
        } catch (NumberFormatException e) {
            index = floats();
        }
        return index;
    }
}
