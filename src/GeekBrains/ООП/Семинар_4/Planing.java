package GeekBrains.ООП.Семинар_4;

import java.util.Date;

public abstract class Planing {
    protected int id;
    protected Date date = new Date();
    protected String dedlain;
    protected String authorName;
    protected String priority;



    public Planing(int id, Date date, String dedlain, String authorName, String priority) {
        this.id = id;
        this.date = date;
        this.dedlain = dedlain;
        this.authorName = authorName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Planing{" +
                "id=" + id +
                ", date=" + date +
                ", dedlain='" + dedlain + '\'' +
                ", authorName='" + authorName + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
