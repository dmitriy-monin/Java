package GeekBrains.Исключения.Seminar_1;

import java.util.ArrayList;

public class Main_4 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 7, null, null, 2};
        System.out.println("Indexes with null values" + checkArray(arr));
    }

    public static ArrayList<Integer> checkArray(Integer[] arr) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == null) {
                indexes.add(i);
            }
        return indexes;
    }
}
