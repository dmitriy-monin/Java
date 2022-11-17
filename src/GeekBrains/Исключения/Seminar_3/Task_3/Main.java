package GeekBrains.Исключения.Seminar_3.Task_3;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
при условии что подали на вход корректный массив).

 */
public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                            {"4", "3", "2", "1"},
                            {"2", "3", "1", "4"},
                            {"2", "2", "4", "5"}};

        try {
            checkArray(array);
            System.out.println(sumElementsOfArray(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArray(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Size array not 4x4");
        }
    }

    public static int sumElementsOfArray(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Symbol or number " +
                            " in " + (i+1) + " x " + (j+1));
                }
            }
        }
        return sum;
    }
}