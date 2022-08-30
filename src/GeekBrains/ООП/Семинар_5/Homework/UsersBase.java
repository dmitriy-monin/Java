package GeekBrains.ООП.Семинар_5.Homework;

import java.util.ArrayList;
import java.util.List;

public class UsersBase {
    private int id=1;
    private List<Person> userBase;
    private int index;

    public UsersBase() {
        this.id = id;
        this.userBase = new ArrayList<>();
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public List<Person> getUserBase() {
        return userBase;
    }

    public void UsersBase(Person person) {
        userBase.add(person);
        System.out.println("ADD "+ userBase.get(id-1));
        id++;
    }

    public void DeleteUser(int index) {
        userBase.remove(index);
    }

    public void BlockUser(int index, Person block){
        userBase.add(index, block);
    }


}
