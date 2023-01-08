package GeekBrains.Исключения.Seminar_3.Homework;

public class IllegalDataLengthException extends Exception{
    public IllegalDataLengthException() {
        super("Введено неверное количество данных");
    }
}
