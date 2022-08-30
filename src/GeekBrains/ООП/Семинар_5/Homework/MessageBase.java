package GeekBrains.ООП.Семинар_5.Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MessageBase {
    private static Person person1;
    private static Person person2;

    private static int id = 1;

    private List<String> messageBase;

    private static String getMess = "";


    public MessageBase() {
        this.id = id;
        this.messageBase = new ArrayList<String>();
        this.person1 = person1;
        this.person2 = person2;
        this.getMess = getMess;

    }

    public static int getId() {
        return id;
    }

    public static Person getPerson1() {
        return person1;
    }

    public static Person getPerson2() {
        return person2;
    }

    public static String getGetMess() {
        return getMess;
    }

    @Override
    public String toString() {
        return "MessageBase{" +
                "messageBase=" + messageBase +
                '}';
    }

    public String MessageBase(Person person1, Person person2, String message) {
        messageBase.add(message);
        getMess = messageBase.get(id-1);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime current = LocalDateTime.of(date, time);

        System.out.println("Добавлено новое сообщение! \n" +
                "Дата и время отправки: " + current + "\n" +
                "Отправитель: " + person1.getName() + " " + person1.getSurname() + " (" + person1.getPhoneNumber() + ")\n" +
                "Получатель: " + person2.getName() + " " + person2.getSurname() + " (" + person2.getPhoneNumber() + ")\n" +
                "Сообщение: " + messageBase.get(id - 1));
        id++;
        return getMess;
    }


}
