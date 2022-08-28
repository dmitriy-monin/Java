package GeekBrains.ООП.Семинар_5.Homework;

import java.util.ArrayList;
import java.util.List;

public class UsersBase {
    private static int id=1;
    private static List<Person> userBase;

    public UsersBase() {
        this.id = id;
        this.userBase = new ArrayList<>();
    }

    public static int getId() {
        return id;
    }

    public static List<Person> getUserBase() {
        return userBase;
    }

    public void UsersBase(Person person) {
        userBase.add(person);
        System.out.println("ADD "+ userBase.get(id-1));
        id++;
    }

}
