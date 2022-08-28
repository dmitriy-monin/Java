package GeekBrains.ООП.Семинар_5.Homework.Roles;

import GeekBrains.ООП.Семинар_5.Homework.Person;
import GeekBrains.ООП.Семинар_5.Homework.Role;

public class Admin extends Person {

    public Admin(String name, String surname, Long phoneNumber, Role role) {
        super(name, surname, phoneNumber, role);
    }

}
