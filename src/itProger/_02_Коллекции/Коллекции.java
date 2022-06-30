package itProger._02_Коллекции;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Коллекции {
    public static void main(String[] args){
        /*
        Коллекции в Java (List, ArrayList, LinkedList)
        Если нужен массив в котором надо что то удалять или добавлять лучше использовать LinkedList.
        Если добавлять и удалять ничего не планируем тогда лучше ArrayList для лучшей оптимизации программы.
        */
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(1);                  // Добавление элемента в коллекцию
        list.add(1,7);  // Замена элемента в коллекции
        list.remove(2);         // Удаление эллемента из коллекции

        System.out.println(list);
        System.out.println("Количество элементов в коллекции: " + list.size());
        System.out.println("4-й элемент коллекции: " + list.get(4));

        System.out.print("До сортировки: ");
        for(Integer counter : list)
            System.out.print(counter + " ");

        Collections.sort(list);
        System.out.println();
        System.out.print("Сортировка по возрастанию: ");
        for(Integer counter: list)
            System.out.print(counter + " ");

        Collections.sort(list, java.util.Collections.reverseOrder());
        System.out.println();
        System.out.print("Сортировка по убыванию: ");
        for(Object counter: list)
            System.out.print(counter + " ");

    }
}
