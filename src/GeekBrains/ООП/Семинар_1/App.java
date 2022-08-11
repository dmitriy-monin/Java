package GeekBrains.ООП.Семинар_1;


public class App {

    public static void main(String[] args) {
        Person Dima = new Person("Dima", "M");
        Person Oleg = new Person("Oleg", "M");
        Person Alla = new Person("Alla", "M");
        Person Alena = new Person("Alena", "M");
        Person Sasha = new Person("Sasha", "M");

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

        Research.infoAboutPerson("Alena", tree);     // Вся информация о конкретном человеке
//        Research.printAllChildren("Oleg", tree);     // Дети
//        Research.printParent("Sasha", tree);          // Родители
        Output.output_data(tree, Aim.FILE);
    }

}