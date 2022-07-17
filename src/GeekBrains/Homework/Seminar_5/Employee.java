package GeekBrains.Homework.Seminar_5;

import java.util.*;

/*
Список сотрудников некой фирмы хранится в виде, например, такой HashMap
HashMap<Integer, ArrayList<String>> persons = new HashMap<>();
где ключ - серия и номер паспорта сотрудника, а в списке хранятся его параметры
1) Написать метод, возвращающий всех однофамильцев (или тёзок)
2) Написать метод, возвращающий сотрудников, старше (младше) определенного возраста
 */

public class Employee {

    public static Map<Integer, ArrayList<String>> persons = new HashMap<>();
    public static List<String> FIO = new ArrayList<>();

    public static void main(String[] args) {
        persons.put(1111, new ArrayList<String>(Arrays.asList("Петров", "Иван", "Иванович", "32")));
        persons.put(2222, new ArrayList<String>(Arrays.asList("Семенов", "Олег", "Степанович", "44")));
        persons.put(3333, new ArrayList<String>(Arrays.asList("Степанов", "Иван", "Олегович", "23")));
        persons.put(4444, new ArrayList<String>(Arrays.asList("Семенов", "Петр", "Петрович", "24")));
        persons.put(5555, new ArrayList<String>(Arrays.asList("Петров", "Иван", "Иванович", "47")));

        System.out.println("Однофамильцы:");
        getNamesakes((HashMap<Integer, ArrayList<String>>) persons);

        System.out.printf("%nСтарше 30 лет:%n");
        for (int i : persons.keySet())
            getAge(persons.get(i));
    }


    public static void getNamesakes(HashMap<Integer, ArrayList<String>> name) {
        ArrayList<String> name1 = new ArrayList<>();
        for (int i : name.keySet())
            name1.add(name.get(i).get(0));
        for (ArrayList<String> j : name.values()) {
            if (Collections.frequency(name1, j.get(0)) > 1) {
                System.out.println(j);
            }
        }
    }

    public static void getAge(ArrayList<String> FIO_age) {
        if (Integer.parseInt(FIO_age.get(3)) > 30)
            System.out.println(FIO_age);
    }
}


