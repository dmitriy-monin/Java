package GeekBrains.Исключения.Seminar_3.Task_2;

public class Main_2 {
    public static void main(String[] args) {
/* 1.
        int a = 10;
        int b = 0;
        if (b==0) {
            throw new DivideByZeroException("divide by zero");
        }
 */

/* 2.
        Integer[] array = new Integer[] {1, null, 3};

        for (Integer i : array) {
            if (i == null) throw new NullElementInArrayException();
            else System.out.println(i);
        }
 */

/* 3.
        try {
            tryRead();
        } catch (FileNotExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tryRead() throws FileNotExistException {
        FileReader reader;
        try {
            reader = new FileReader("123.txt");
        } catch (IOException e) {
            throw new FileNotExistException();
        }

 */
    }
}
