package GeekBrains.ООП.Семинар_5.Homework.Rights;

import GeekBrains.ООП.Семинар_5.Homework.Person;
import GeekBrains.ООП.Семинар_5.Homework.UsersBase;

public interface RightAdmin extends RightsModerator{

    void blockUser(UsersBase userBase, Person person, int indexUser);
    void deleteUser(UsersBase userBase, Person person1, int indexUser);

}
