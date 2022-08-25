public class App {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        User user1 = new User("Oleg", "Dmitrov", 01);
        User user2 = new User("Dima", "Solovyov", 02);
        messenger.regestrUser(user1);
        messenger.regestrUser(user2);
        user1.sendMessage(user2, "Hello World");
        user2.sendMessage(user1, "Goodbye");
        System.out.println(messenger.messageList);

        Moderator user3 = new Moderator("Olga", "Solov", 3);
        Admin user4 = new Admin("Slava", "Korolev", 4);
        messenger.regestrUser(user3);
        messenger.regestrUser(user4);

        messenger.renameMassage(user4,2,"RENAME text");
        System.out.println(messenger.messageList);
        messenger.deleteMessage(user3, 1);
        System.out.println(messenger.messageList);
    }
}
