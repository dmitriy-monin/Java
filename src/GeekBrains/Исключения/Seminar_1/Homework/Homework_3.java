package GeekBrains.Исключения.Seminar_1.Homework;

import java.util.LinkedList;
import java.util.List;

public class Homework_3 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 3, 5, 7, 9, 11, 13};
        int[] arrayTwo = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(sumArrays(arrayOne, arrayTwo));
    }

    public static List<Integer> sumArrays(int[] arrayOne, int[] arrayTwo) {
        List<Integer> sumArray = new LinkedList<>();
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                sumArray.add(arrayOne[i] + arrayTwo[i]);
            }
        } else {
            throw new RuntimeException("Length arrays not equal");
        }
        return sumArray;
    }
}
