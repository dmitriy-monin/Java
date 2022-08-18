package GeekBrains.ООП.Семинар_3.ДЗ.Generation;

import GeekBrains.ООП.Семинар_3.ДЗ.Person;
import GeekBrains.ООП.Семинар_3.ДЗ.Searchable;

public class Grandadults extends Person {

    public Grandadults(String name, String surname, int age, Searchable searchable) {
        super(name, surname, age, searchable);
    }

    public Grandadults(String name, String surname, Searchable searchable) {
        super(name, surname, searchable);
    }

    @Override
    public String toString() {
        String a = "";
        if (age != 0) {
            a = "Grandadults{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age='" + age + '\'' +
                    '}'+'\n';
        } else {
            a = "Grandadults{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
        return a;
    }
}
