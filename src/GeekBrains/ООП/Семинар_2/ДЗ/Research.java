package GeekBrains.ООП.Семинар_2.ДЗ;


import java.io.IOException;
import java.util.List;
import java.io.FileWriter;

public class Research {

    public static void printAllChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();
        System.out.println("Дети " + name + ":");
        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void printParent(String name, Tree tree) {
        List<Link> links = tree.getLinks();
        System.out.println("Родители " + name + ":");
        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.CHILD) {
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void infoAboutPerson(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        if (name == "Dima" || name == "Sasha") {
            System.out.println("Родители " + name + ":");
            Relation relation = Relation.CHILD;
            infoPerson(name, links, relation);
        }

        if (name == "Oleg" || name == "Alla" || name == "Dima" || name == "Alena") {
            System.out.println("Дети " + name + ":");
            Relation relation = Relation.PARENT;
            infoPerson(name, links, relation);
        }

        if (name == "Dima" || name == "Oleg") {
            System.out.println("Жена " + name + ":");
            Relation relation = Relation.HUSBAND;
            infoPerson(name, links, relation);
        }

        if (name == "Alla" || name == "Alena") {
            System.out.println("Муж " + name + ":");
            Relation relation = Relation.WIFE;
            infoPerson(name, links, relation);
        }

        if (name == "Sasha") {
            System.out.println("Дедушка и бабушка " + name + ":");
            Relation relation = Relation.GRANDSONS;
            infoPerson(name, links, relation);
        }

        if (name == "Oleg" || name == "Alla") {
            System.out.println("Внуки " + name + ":");
            Relation relation = Relation.GRANDFATHER;
            infoPerson(name, links, relation);
            relation = Relation.GRANDMOTHER;
            infoPerson(name, links, relation);
        }

        if (name == "Oleg") {
            System.out.println("Сноха " + name + ":");
            Relation relation = Relation.FATHER_IN_LAW;
            infoPerson(name, links, relation);
        }

        if (name == "Alla") {
            System.out.println("Невестка " + name + ":");
            Relation relation = Relation.MOTHER_IN_LAW;
            infoPerson(name, links, relation);
        }

        if (name == "Alena") {
            System.out.println("Свёкр и свекровь " + name + ":");
            Relation relation = Relation.DAUGHTER_IN_LAW;
            infoPerson(name, links, relation);
        }

        try(FileWriter writer = new FileWriter("output.txt", false)) {
            for (Link el : links) {
                writer.write(el.toString());
                writer.write("\n");
                writer.flush();
            }
        }
        catch(IOException ex) {
            System.err.println();
        }
    }
    private static void infoPerson(String name, List<Link> links, Relation relation){
        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == relation) {
                System.out.println(el.getPersonSecond());
            }
        }

    }
}
