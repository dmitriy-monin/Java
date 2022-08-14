package GeekBrains.ООП.Семинар_2.ДЗ;

public class Link {
    private Person personFirst;
    private Person personSecond;
    private Relation link;

    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Person getPersonFirst() {
        return personFirst;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getLink() {
        return link;
    }

}
