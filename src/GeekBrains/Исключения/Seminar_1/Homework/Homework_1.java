package GeekBrains.Исключения.Seminar_1.Homework;

public class Homework_1 {

    public static void main(String[] args) {

        indexOut(new int[]{1, 4, 6, 5, 7});
        byZero(10, 0);
        stackOverflow();
    }

    public static void indexOut(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += array[i];
        }
    }

    public static void byZero(int a, int b) {
        int result = a / b;
    }

    public static void stackOverflow() {
        stackOverflow();
    }
}
