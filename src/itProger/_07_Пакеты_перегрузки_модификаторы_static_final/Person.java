package itProger._07_Пакеты_перегрузки_модификаторы_static_final;

public class Person {

    private static int count;

    public Person(){
        count++;
    }
    public static void getCount(){
        System.out.println("Количество: " + count);
    }
}
