package GeekBrains.ООП.Семинар_2.ДЗ.Generation;

import GeekBrains.ООП.Семинар_2.ДЗ.Person;

public class Childs extends Person {

    public Childs(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Childs(String name, String surname) {
        super(name, surname);
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
