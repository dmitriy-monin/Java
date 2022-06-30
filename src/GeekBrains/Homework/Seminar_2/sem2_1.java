package GeekBrains.Homework.Seminar_2;

import java.util.Scanner;

public class sem2_1 {
    static boolean isTriangular(int num) {
        if (num < 0)
            return false;

        int sum = 0;

        for (int n = 1; sum <= num; n++) {
            sum = sum + n;
            if (sum == num)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isTriangular(n))
            System.out.print("Число является треугольным!");
        else
            System.out.print("Число НЕ является треугольным!");
    }
}