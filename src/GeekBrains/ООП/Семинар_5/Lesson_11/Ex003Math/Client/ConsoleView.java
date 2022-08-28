package GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Client;

import GeekBrains.ООП.Семинар_5.Lesson_11.Ex003Math.Core.Views.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
