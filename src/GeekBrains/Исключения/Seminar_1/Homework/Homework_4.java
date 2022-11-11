package GeekBrains.Исключения.Seminar_1.Homework;

import java.util.LinkedList;
import java.util.List;

public class Homework_4 {
    public static void main(String[] args) {
        int[] arrayOne = {4, 9, 12, 7, 9, 11, 13};
        int[] arrayTwo = {2, 3, 2, 4, 3, 2, 1};
        System.out.println(sumArrays(arrayOne, arrayTwo));
    }

    public static List<Integer> sumArrays(int[] arrayOne, int[] arrayTwo) {
        List<Integer> sumArray = new LinkedList<>();
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayTwo[i] != 0) {
                    sumArray.add(arrayOne[i] / arrayTwo[i]);
                } else {
                    throw new RuntimeException("You can't divide by zero");
                }
            }
        } else {
            throw new RuntimeException("Length arrays not equal");
        }
        return sumArray;
    }
}
