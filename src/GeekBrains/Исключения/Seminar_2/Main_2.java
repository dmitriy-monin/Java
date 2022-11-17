package GeekBrains.Исключения.Seminar_2;

public class Main_2 {
    public static int[][] arr = {{1, 0, 0}, {1, 1, 1}, {1, 1, 1}};
    public static void main(String[] args) {

        }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
