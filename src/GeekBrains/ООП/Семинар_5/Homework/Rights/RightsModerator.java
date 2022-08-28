package GeekBrains.ООП.Семинар_5.Homework.Rights;

import GeekBrains.ООП.Семинар_5.Homework.Person;

public interface RightsModerator extends RightsUser{
    void editMessage(Person person, String getMess, String getMess1);
    void deleteMessage(Person person, String getMess);
}
