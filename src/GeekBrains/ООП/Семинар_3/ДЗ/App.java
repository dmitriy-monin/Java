package GeekBrains.ООП.Семинар_3.ДЗ;


import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Adults;
import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Childs;
import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Grandadults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person Dima = new Adults("Dima", "M", 32, new Research());
        Person Oleg = new Grandadults("Oleg", "M",56, new Research());
        Person Alla = new Grandadults("Alla", "M", 55, new Research());
        Person Alena = new Adults("Alena", "M", 31, new Research());
        Person Sasha = new Childs("Sasha", "M",7, new Research());

        Tree tree = new Tree();

        tree.addLink(Oleg, Dima, Relation.PARENT, Relation.CHILD);
        tree.addLink(Alla, Dima, Relation.PARENT, Relation.CHILD);
        tree.addLink(Alena, Dima, Relation.WIFE, Relation.HUSBAND);
        tree.addLink(Sasha, Dima, Relation.CHILD, Relation.PARENT);

        tree.addLink(Oleg, Alla, Relation.HUSBAND, Relation.WIFE);
        tree.addLink(Oleg, Alena, Relation.FATHER_IN_LAW, Relation.DAUGHTER_IN_LAW);
        tree.addLink(Oleg, Sasha, Relation.GRANDFATHER, Relation.GRANDSONS);

        tree.addLink(Alla, Alena, Relation.MOTHER_IN_LAW, Relation.DAUGHTER_IN_LAW);
        tree.addLink(Alla, Sasha, Relation.GRANDMOTHER, Relation.GRANDSONS);

        tree.addLink(Alena, Sasha, Relation.PARENT, Relation.CHILD);

//        Output.outputData(tree, Aim.FILE);

//        Dima.searchAllChildren(tree);
//        Oleg.searchAllChildren(tree);
//        Alena.searchAllChildren(tree);
//        Sasha.searchParent(tree);
//        Alla.searchInfoAboutPerson(tree);
//        Dima.searchInfoAboutPerson(tree);

        List<Person> sortAge = new ArrayList<>();
        sortAge.add(Dima);
        sortAge.add(Alena);
        sortAge.add(Sasha);
        sortAge.add(Alla);
        sortAge.add(Oleg);
        sortAge.sort(new AgeCompar());
//        for (Person item : sortAge)
//            System.out.println(item.toString());
        System.out.println(sortAge);
        sortAge.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(sortAge);

        sortAge.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(sortAge);
        Collections.sort(sortAge);
        System.out.println(sortAge);

    }
}