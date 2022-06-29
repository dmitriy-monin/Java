package itProger;

public class Функции {
    public static void main(String[] args){
        info();
        info1("World");
        summa((short) 5, (short) 7);
        summa((short) 8, (short) 7);
        int result = summa((short) 2, (short) 3);
        System.out.print("Вернулось: ");
        info1(String.valueOf(result));

        byte[] num = new byte[] {3, 6, 9};
        System.out.println("Сумма массива 1: " + summaArray(num));

        byte[] num1 = new byte[] {8, 4, 2};
        System.out.println("Сумма массива 2: " + summaArray(num1));
    }
    public static void info(){
        System.out.print("Hello ");
    }

    public static void info1(String word){
        System.out.print(word);
        System.out.println("!");
    }

    public static int summa(short a, short b){
        int res = a + b;
        String result = "Результат: " + res;
        info1(result);
        return res;
    }

    public static int summaArray(byte[] num){
        int summa = 0;
        for (byte i = 0; i < num.length; i++) {
            summa += num[i];
        }
        return summa;
    }

}
