package GeekBrains.ООП.Семинар_2.ДЗ.Generation;

import GeekBrains.ООП.Семинар_2.ДЗ.Person;

public class Adults extends Person {

    public Adults(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Adults{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
