package GeekBrains.ООП.Семинар_3.ДЗ.Generation;

import GeekBrains.ООП.Семинар_3.ДЗ.Person;
import GeekBrains.ООП.Семинар_3.ДЗ.Searchable;

public class Adults extends Person {

    public Adults(String name, String surname, Searchable searchable) {
        super(name, surname, searchable);
    }

    @Override
    public String toString() {
        return "Adults{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
