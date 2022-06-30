package GeekBrains.Homework.Seminar_2;

import java.util.Scanner;

public class sem2_2 {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)

    {
        if (n == 1)
        {
            System.out.println("Переместите диск 1 со стержня " +  from_rod + " на стержень " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Переместите диск " + n + " со стержня " +  from_rod + " на стержень " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String args[])
    {
        System.out.print("Введите количество дисков: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}

