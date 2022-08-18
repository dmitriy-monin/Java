package GeekBrains.ООП.Семинар_3.ДЗ;

import java.util.Comparator;

public class AgeCompar implements Comparator <Person>{
    @Override
    public int compare(Person p1, Person p2) {

        return p1.getAge() - p2.getAge();
    }
}
