package itProger._07_Пакеты_перегрузки_модификаторы_static_final;

import itProger._07_Пакеты_перегрузки_модификаторы_static_final.DataBase.DB;

public class Main {
    public static void main (String[] args){

        final int count = 10;

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        Person.getCount();

//        Person.count = 5;
//        System.out.println(Person.count);

        DB db = new DB();

        info();
        info("Hello World ", "888");
    }

    public static void info(){
        System.out.println("Hello");
    }
    public static void info(String word, String word1){
        System.out.println(word + word1 + "!");
    }
}