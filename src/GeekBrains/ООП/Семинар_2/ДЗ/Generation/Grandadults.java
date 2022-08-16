package GeekBrains.ООП.Семинар_2.ДЗ.Generation;

import GeekBrains.ООП.Семинар_2.ДЗ.Person;

public class Grandadults extends Person {
    public Grandadults(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Grandadults{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}