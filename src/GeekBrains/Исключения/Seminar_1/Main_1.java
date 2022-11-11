package GeekBrains.Исключения.Seminar_1;

public class Main_1 {
    public static final int MIN_LENGTH = 3;
    public static final int search = 3;

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 5, 7};

        checkExeption(checkArrayLength(array));
    }

    public static int checkArrayLength(int[] array){
        if(array != null) {
            if (array.length >= MIN_LENGTH) {
                for (int i : array) {
                    if (i == search) {
                        return i;
                    }
                }
                return -2;
            }
            return -1;
        }
        return -3;
    }

    public static void checkExeption(int num) {
        switch (num) {
            case -1:
                System.out.println("Длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println(num);
        }
    }
}
