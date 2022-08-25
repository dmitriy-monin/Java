package GeekBrains.ООП.Семинар_4.ДЗ;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private DataBase(){}
    private static final List<Date> dataBase = new ArrayList<>();

    public static void putData(Date data) {
        dataBase.add(data);
    }
}
