package GeekBrains.ООП.Семинар_5.Homework;

import GeekBrains.ООП.Семинар_5.Homework.Rights.RightAdmin;
import GeekBrains.ООП.Семинар_5.ДЗ.Message;

import java.util.List;
import java.util.Scanner;

public class Messanger implements RightAdmin {

    private Person person1;
    private Person person2;
    private Main scanner;
    private List<Message> messageList;

    public Messanger() {
        this.person1 = person1;
        this.person2 = person2;
        this.scanner = scanner;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public Main getScanner() {
        return scanner;
    }


    @Override
    public void sendMessage(Person person1, Person person2) {
        System.out.println("Отправитель: " + person1.getName() + " " + person1.getSurname() + " (" + person1.getPhoneNumber() + ")\n" +
                "Получатель: " + person2.getName() + " " + person2.getSurname() + " (" + person2.getPhoneNumber() + ")\n" +
                "Введите сообщение: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();
        System.out.println("Сообщение отправлено!");
        System.out.println();
        MessageBase addMessage = new MessageBase();
        addMessage.MessageBase(person1, person2, message);
    }

    @Override
    public void getMessage(Person person1, Person person2, String getMess) {
        System.out.println("Получено сообщение от " + person1.getName() + " " + person1.getSurname() + "\n" +
                "Сообщение: " + getMess);
    }


    @Override
    public void editMessage(Person person, String getMess, String getMess1) {
        if (person.getRole() == Role.MODERATOR || person.getRole() == Role.ADMIN){
            getMess = getMess1;
            System.out.println(getMess);
        }

    }

    @Override
    public void deleteMessage(Person person, String getMess) {
        if (person.getRole() == Role.MODERATOR || person.getRole() == Role.ADMIN){
            getMess = "Сообщение удалено!";
            System.out.println(getMess);
        }
    }

    @Override
    public void blockUser() {

    }

    @Override
    public void deleteUser() {

    }

}