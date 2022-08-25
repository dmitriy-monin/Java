package GeekBrains.ООП.Семинар_4;


import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Link lowPriority = new Link();
        lowPriority.addLink(1, new Date(), "01.02.2023", "Alex", Priority.LOW_PRIORITY);
        lowPriority.addLink(2, new Date(), "21.09.2024", "Dima", Priority.LOW_PRIORITY);

    }
}
