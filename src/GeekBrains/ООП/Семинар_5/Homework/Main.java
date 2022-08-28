package GeekBrains.ООП.Семинар_5.Homework;

import GeekBrains.ООП.Семинар_5.Homework.Roles.Admin;
import GeekBrains.ООП.Семинар_5.Homework.Roles.Moderator;
import GeekBrains.ООП.Семинар_5.Homework.Roles.User;

/**
 * Разработать "мессенджер". Нужен следующий функционал:
 * - различные виды пользователей: обычный user, админ, модератор и тд. Наделить пользователей различными ролями
 * - различные хранилища: сообщения, пользователи и тд
 * - продумать модель сообщений: дата отправки, возможность редактирования, возможность удаления, дата обновления сообщения
 * Дополнительно:
 * - поиск по сообщениям
 * - проявить фантазию и добавить свой функционал)
 */

public class Main {
    public static void main(String[] args) {
        UsersBase addBase = new UsersBase();
        User user = new User("Alex", "Sam", 89991234567L, Role.USER);
        addBase.UsersBase(user);
        User user1 = new User("Max", "Iva", 89931244469L, Role.USER);
        addBase.UsersBase(user);
        Moderator moderator = new Moderator("Sam", "Van", 89110989009L, Role.MODERATOR);
        addBase.UsersBase(moderator);
        Admin admin = new Admin("David", "Hanov", 89221212211L, Role.ADMIN);
        addBase.UsersBase(admin);

        System.out.println();

        Messanger messanger = new Messanger();
        messanger.sendMessage(user, user1);
        System.out.println();
        messanger.getMessage(user, user1, MessageBase.getGetMess());
        System.out.println();
        messanger.deleteMessage(moderator,MessageBase.getGetMess());
        System.out.println();
        messanger.editMessage(moderator,MessageBase.getGetMess(), "Сообщение изменено!");
    }
}
