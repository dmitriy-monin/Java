package GeekBrains.Исключения.Seminar_3.Task_2;

public class NullElementInArrayException extends NullPointerException {

    public NullElementInArrayException() {
        super("Element of array is Null");
    }
    public NullElementInArrayException(String message) {
        super(message);
    }
}
