package GeekBrains.ООП.Семинар_3.ДЗ.Generation;

import GeekBrains.ООП.Семинар_3.ДЗ.Person;
import GeekBrains.ООП.Семинар_3.ДЗ.Searchable;

public class Childs extends Person {

    public Childs(String name, String surname, int age, Searchable searchable) {
        super(name, surname, age, searchable);
    }

    public Childs(String name, String surname, Searchable searchable) {
        super(name, surname, searchable);
    }

    @Override
    public String toString() {
        String a = "";
        if (age != 0) {
            a = "Childs{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        } else {
            a = "Childs{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
        return a;
    }
}
