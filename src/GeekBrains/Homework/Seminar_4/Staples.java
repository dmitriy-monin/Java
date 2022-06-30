package GeekBrains.Homework.Seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class Staples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean stat;
        stat = true;

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                    case '<':
                    case '[':
                    case '{':
                        stack.push(str.charAt(i));
                        break;

                    case ')':
                        if ((stack.peek() != '(') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;

                    case ']':
                        if ((stack.peek() != '[') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;

                    case '}':
                        if ((stack.peek() != '{') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;

                    case '>':
                        if ((stack.peek() != '<') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;
                }
                if (!stat) {
                    break;
                }
            }

            if (stack.empty())
                System.out.print(true);
            else
                System.out.print(false);
        }
    }
