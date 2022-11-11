package GeekBrains.Исключения.Seminar_1;

public class Main_3 {
    public static int[][] array = {{1, 0, 0}, {1, 1, 1}, {1, 1, 1}};
    public static int sum = 0;

    public static void main(String[] args) {
        checkExeption(getSum(array));
    }

    public static int getSum(int[][] array) {

        for (int[] i : array) {
            if (array.length == i.length) {
                for (int j : i) {
                    if (j == 0 || j == 1) {
                        sum += j;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -2;
            }
        }
        return sum;
    }

    public static void checkExeption(int num) {
        switch (num) {
            case -1:
                System.out.println("Value not 0 or not 1");
                break;
            case -2:
                System.out.println("Not square array");
                break;
            default:
                System.out.println(num);
        }
    }
}
