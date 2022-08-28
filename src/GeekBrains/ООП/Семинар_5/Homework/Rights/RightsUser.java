package GeekBrains.ООП.Семинар_5.Homework.Rights;

import GeekBrains.ООП.Семинар_5.Homework.Person;

public interface RightsUser {
    void getMessage(Person person1, Person person2, String getMess);
    void sendMessage(Person person1, Person person2);

}
