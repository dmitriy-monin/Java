package GeekBrains.Исключения.Seminar_2.Homework;

public class Homework_2 {
    public static void main(String[] args) {

        int intArray[] = {2, 6, 7, 9, 75, 5, 4, 43, 52};
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }
}
