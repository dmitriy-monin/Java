package GeekBrains.ООП.Семинар_1;


import java.util.List;

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
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.CHILD) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Oleg" || name == "Alla" || name == "Dima" || name == "Alena") {
            System.out.println("Дети " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.PARENT) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Dima" || name == "Oleg") {
            System.out.println("Жена " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.HUSBAND) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Alla" || name == "Alena") {
            System.out.println("Муж " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.WIFE) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Sasha") {
            System.out.println("Дедушка и бабушка " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.GRANDSONS) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Oleg" || name == "Alla") {
            System.out.println("Внуки " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.GRANDFATHER) {
                    System.out.println(el.getPersonSecond());
                }
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.GRANDMOTHER) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Oleg") {
            System.out.println("Сноха " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.FATHER_IN_LAW) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Alla") {
            System.out.println("Невестка " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.MOTHER_IN_LAW) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        if (name == "Alena") {
            System.out.println("Свёкр и свекровь " + name + ":");
            for (Link el : links) {
                if (el.getPersonFirst().getName().equals(name) &&
                        el.getLink() == Relation.DAUGHTER_IN_LAW) {
                    System.out.println(el.getPersonSecond());
                }
            }
        }

        try(java.io.FileWriter writer = new java.io.FileWriter("output.txt", false)) {
            for (Link el : links) {
                writer.write(el.toString());
                writer.write("\n");
                writer.flush();
            }
        }
        catch(java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
