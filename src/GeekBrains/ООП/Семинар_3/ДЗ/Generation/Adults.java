package GeekBrains.ООП.Семинар_3.ДЗ.Generation;

import GeekBrains.ООП.Семинар_3.ДЗ.Person;
import GeekBrains.ООП.Семинар_3.ДЗ.Searchable;

public class Adults extends Person {

    public Adults(String name, String surname, int age, Searchable searchable) {
        super(name, surname, age, searchable);
    }

    public Adults(String name, String surname, Searchable searchable) {
        super(name, surname, searchable);
    }

    @Override
    public String toString() {
        String a = "";
        if (age != 0) {
            a = "Adults{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age='" + age + '\'' +
                    '}'+'\n';
        } else {
            a = "Adults{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
        return a;
    }
}
