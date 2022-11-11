package GeekBrains.Исключения.Seminar_1;

public class Main_2 {
    public static int[][] array = {{1, 0, 0}, {1, 1, 1}, {1, 1, 1}};
    public static int sum = 0;

    public static void main(String[] args) {

            System.out.println(getSum(array));

    }

    public static int getSum(int[][] array) {

        for (int[] i : array) {
            if (array.length == i.length) {
                for (int j : i) {
                    if (j == 0 || j == 1) {
                        sum += j;
                    } else {
                        throw new RuntimeException("Value not 0 or not 1");
                    }
                }
            } else {
                throw new RuntimeException("Not square array");
            }
        }
        return sum;
    }
}
