package GeekBrains.ООП.Семинар_3.ДЗ;

public abstract class Person implements Comparable <Person>{
    protected String name;
    protected String surname;
    protected int age;
    protected Searchable searchable;

    public Person(String name, String surname, Searchable searchable) {
        this.name = name;
        this.surname = surname;
        this.searchable = searchable;
    }

    public Person(String name, String surname, int age, Searchable searchable) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.searchable = searchable;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void searchAllChildren(Tree tree){
        searchable.printAllChildren(name, tree);
    }

    public void searchParent(Tree tree){
        searchable.printParent(name, tree);
    }

    public void searchInfoAboutPerson(Tree tree){
        searchable.infoAboutPerson(name, tree);
    }

    @Override
    public int compareTo(Person o){
        return o.age - this.age;
    }
}