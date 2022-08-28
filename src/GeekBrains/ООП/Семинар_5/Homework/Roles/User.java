package GeekBrains.ООП.Семинар_5.Homework.Roles;

import GeekBrains.ООП.Семинар_5.Homework.Person;
import GeekBrains.ООП.Семинар_5.Homework.Role;

public class User extends Person{
    public User(String name, String surname, Long phoneNumber, Role role) {
        super(name, surname, phoneNumber, role);
    }
}
