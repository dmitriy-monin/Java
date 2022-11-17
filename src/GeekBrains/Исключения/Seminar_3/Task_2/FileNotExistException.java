package GeekBrains.Исключения.Seminar_3.Task_2;

import java.io.FileNotFoundException;

public class FileNotExistException extends FileNotFoundException {
    public FileNotExistException() {
        super("File not found");
    }
}
