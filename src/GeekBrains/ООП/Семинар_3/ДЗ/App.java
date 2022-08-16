package GeekBrains.ООП.Семинар_3.ДЗ;


import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Adults;
import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Childs;
import GeekBrains.ООП.Семинар_3.ДЗ.Generation.Grandadults;

public class App {

    public static void main(String[] args) {

        Person Dima = new Adults("Dima", "M", new Research());
        Person Oleg = new Grandadults("Oleg", "M", new Research());
        Person Alla = new Grandadults("Alla", "M", new Research());
        Person Alena = new Adults("Alena", "M", new Research());
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
        Alla.searchInfoAboutPerson(tree);

    }

}