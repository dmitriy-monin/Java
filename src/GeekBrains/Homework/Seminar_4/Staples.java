package GeekBrains.Homework.Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Staples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String s = scan.nextLine();

        Deque<Character> deque = new ArrayDeque<>();
        boolean status;
        status = true;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '<':
                case '[':
                case '{':
                    deque.addFirst(s.charAt(i));
                    break;

                case ')':
                    if ((deque.peekFirst() != '(') || deque.peekFirst() == null) {
                        status = false;
                        break;
                    } else deque.pop();
                    break;

                case ']':
                    if ((deque.peekFirst() != '[') || deque.peekFirst() == null) {
                        status = false;
                        break;
                    } else deque.pop();
                    break;

                case '}':
                    if ((deque.peekFirst() != '{') || deque.peekFirst() == null) {
                        status = false;
                        break;
                    } else deque.pop();
                    break;

                case '>':
                    if ((deque.peekFirst() != '<') || deque.peekFirst() == null) {
                        status = false;
                        break;
                    } else deque.pop();
                    break;
            }
            if (!status) {
                break;
            }
        }

        if (deque.peekFirst() == null)
            System.out.print(true);
        else
            System.out.print(false);
    }
}
